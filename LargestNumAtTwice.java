public class LargestNumAtTwice{
    public int dominantIndex(int[] nums) {
        int res=0;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max1<nums[i]){
                max2=max1;
                max1=nums[i];
                res=i;
            }
            else if(max2<nums[i]){
                max2=nums[i];
            }
        }
        if(max1>=(max2*2)){
            return res;
        }
        return -1;
    }
}