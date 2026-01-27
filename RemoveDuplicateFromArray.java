public class RemoveDuplicateFromArray {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int i=0;
        if(nums.length == 0){
            return 0;
        }
        for(i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[j]=nums[i];
                j++;
            }
        }
        nums[j]=nums[i];
        j++;
        return j;
    }
}

