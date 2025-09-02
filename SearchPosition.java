class Solution {
    public int searchInsert(int[] nums, int target) {
       int  result=0;
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
           result=i++;
           break;
        }
        else{
            result=nums.length;
        }
    }
    return result;
}
}
public class SearchPosition{
    public static void main(String args[]){
        Solution s=new Solution();
        int[] nums={1,3,5,6};
        int target=5;
        s.searchInsert(nums,target);
    }
}