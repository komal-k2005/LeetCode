class Solution {
    public void moveZeroes(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[n]=nums[i];
                n++;
            }
        }
        for(int i=n;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
public class MoveZero{
    public static void main(String args[]){
        Solution s=new Solution();
        int[] nums={0,1,0,3,12};
        s.moveZeroes(nums);
    }
}