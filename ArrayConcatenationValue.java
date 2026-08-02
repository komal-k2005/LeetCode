public class ArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        int l=0;
        int r=nums.length-1;
        long res=0;
        while(l<=r){
             if(l==r){
                res+=nums[l];
             }
             else{
                String s=""+nums[l]+nums[r];
                res+=Long.parseLong(s);
             }
            r--;
            l++;
        }
        return res;
    }
}