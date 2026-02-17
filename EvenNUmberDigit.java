public class EvenNUmberDigit {
    public int findNumbers(int[] nums) {
        int n=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            n=evenNumber(nums[i]);
            if(n%2==0){
                c++;
            }
        }
        return c;
    }
    public static int evenNumber(int n){
        int count=0;
        if(n==0){
            count=1;
        }
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}
