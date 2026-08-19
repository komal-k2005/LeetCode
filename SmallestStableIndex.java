public class SmallestStableIndex{
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            min=nums[i];
            for(int j=i;j<nums.length;j++){
                min=Math.min(nums[j],min);
            }
            res=max-min;
            if(res<=k){
                return i;
            }
        }
        return -1;
    }
}