public class SortArrayParity2 {
    public int[] sortArrayByParityII(int[] nums) {
        int swap=0;
        int j=1;
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]%2 == 1){
                while(nums[j]%2 == 1){
                     j+=2;
                }
                swap=nums[j];
                nums[j]=nums[i];
                nums[i]=swap;
            }
            
        }
        return nums;
    }
}

