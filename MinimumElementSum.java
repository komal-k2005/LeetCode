public class MinimumElementSum {
    public int minElement(int[] nums) {      
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,minValue(nums[i]));
        }
        return min;
    }
    static int minValue(int num){
        int r=0;
        int sum=0;
        while(num>0){
            r=num%10;
            sum=sum+r;
            num/=10;
        }
        return sum;
    }
}