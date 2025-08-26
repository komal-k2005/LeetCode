class Solution {
    public int singleNumber(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length;i++){
            flag=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    flag=1;
                }
            }
            if(flag==0){
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int[] nums={1,2,1};
        s.singleNumber(nums);
    }
}