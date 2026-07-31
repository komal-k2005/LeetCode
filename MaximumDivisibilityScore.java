public class MaximumDivisibilityScore {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=Integer.MIN_VALUE;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<divisors.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0){
                    c++;
                }
            }
            if(max<c){
                max=c;
                c=0;
                res=divisors[i];
            }
            else if(max==c){
                res=Math.min(res,divisors[i]);
            }
        }
        return res;
    }
}
