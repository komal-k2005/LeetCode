import java.util.Arrays;

public class MinimizeMaximumPair {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0,pairSum=0;
        int j=nums.length-1;
        for(int i=0;i<nums.length/2;i++){
            pairSum=nums[i]+nums[j];
            if(pairSum>sum){
                sum=pairSum;
            }
            j--;
        }
        return sum;
    }
}

