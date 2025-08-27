class Solution {
    public int[] searchRange(int[] nums, int target) {
        int j=-1;
        int k=-1;
        for(int i=0;i<nums.length;i++){
            if(target== nums[i]){
               if(j== -1){
                j=i;
               }
               else{
                k=i;
               }
            }
        }
        return new int[]{j,k};
    }
}
public class RangeSearch{
    public static void main(String args[]){
        Solution s=new Solution();
        int[] nums={5,7,7,8,8,10};
        int target=8;
        s.searchRange(nums,target);
    }
}