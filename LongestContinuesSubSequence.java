public class LongestContinuesSubSequence {
    public int findLengthOfLCIS(int[] nums) {
        int c=1;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                c++;
            }
            else{
                max=Math.max(c,max);
                c=1;
            }
        }
        return Math.max(c,max);
    }
}
