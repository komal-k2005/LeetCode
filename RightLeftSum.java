public class RightLeftSum{
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        int[] ans=new int[nums.length];
        leftSum[0]=0;
        rightSum[nums.length-1]=0;
        int i=1;
        int j=nums.length-2;
        while(nums.length>i){
            leftSum[i]=leftSum[i-1]+nums[i-1];
            rightSum[j]=rightSum[j+1]+nums[j+1];
            i++;
            j--;
        }
        for(int k=0;k<nums.length;k++){
            ans[k]=Math.abs(leftSum[k]-rightSum[k]);
        }
        return ans;
    }
}