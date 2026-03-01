public class DigitSumEqualsToIndex {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i == sumOfNum(nums[i])){
                return i;
            }
        }
        return -1;
    }
    public static int sumOfNum(int n){
       int sum=0;
       int r=0;
        while(0<n){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
}

