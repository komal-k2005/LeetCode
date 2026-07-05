public class UniqueMiddleElements{
    public boolean isMiddleElementUnique(int[] nums) {
        int t=nums[nums.length/2];
        int c=0;
        for(int n:nums){
            if(n==t){
                c++;
            }
        }
        return c==1;
    }
}