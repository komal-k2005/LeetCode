public class FirstUniqueNumber {
    public int firstUniqueEven(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            max=Math.max(n,max);
        }
        int[] freq=new int[max+1];
        for(int n:nums){
            freq[n]++;
        }
        for(int n:nums){
            if(n%2==0 && freq[n]==1){
                return n;
            }
        }
        return -1;
    }
 }