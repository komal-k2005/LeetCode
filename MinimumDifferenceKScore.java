import java.util.Arrays;
public class MinimumDifferenceKScore{
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sub=0;
        if(nums.length == 1){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i+k-1<nums.length;i++){
            sub=nums[i+k-1]-nums[i];
            if(sub<=min){
                min=sub;
            }
        }
        return min;
    }
     
}