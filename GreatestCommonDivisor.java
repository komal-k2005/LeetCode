public class GreatestCommonDivisor {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int i=1;
        int res=0;
        while(i<=min){
            if(max%i==0 && min%i==0){
                res=i;
            }
            i++;
        }
        return res;
    }
}