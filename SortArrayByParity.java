public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        int swap=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i] %2==0){
            swap=nums[i];
            nums[i]=nums[j];
            nums[j]=swap;
            j++;
        }
        }
        return nums;
    }
}

