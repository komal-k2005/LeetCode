public class SumUniqueElement {
    public int sumOfUnique(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int n:nums){
            max=Math.max(n,max);
        }
        int[] freq=new int[max+1];
       for(int n:nums){
        freq[n]++;
       }
       for(int i=0;i<=max;i++){
        if(freq[i]==1){
            sum+=i;
        }
       }
       return sum;
    }
}
