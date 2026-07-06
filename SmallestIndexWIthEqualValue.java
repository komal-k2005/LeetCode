public class SmallestIndexEqualValue{
    public int smallestEqual(int[] nums) {
        int res=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==(i%10)){
                min=Math.min(i,min);
                res=min;
            }
        }
        return res;
    }
}