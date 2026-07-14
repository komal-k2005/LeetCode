public class SumIntWithMaxRange {
    public int maxDigitRange(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int r=countNum(nums[i]);
          if(max<r){
              sum=nums[i];
              max=r;
          }
            else if(max==r){
                sum+=nums[i];
            }
        }
        return sum;
    }
    public static int countNum(int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int r=0;
        while(n>0){
            r=n%10;
            min=Math.min(r,min);
            max=Math.max(r,max);
            n/=10;
        }
        return max-min;
    }
}