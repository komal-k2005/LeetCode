public class MaximumPairStrengthGCD {
    public long maxPairStrength(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long res=gcd(nums[i],nums[j]);
                Long s=(1L*nums[i]*nums[j])/(res*res);
                ans=Math.max(s,ans);
            }
        }
        return ans;
    }
public static long gcd(long a,long b){
    while(b>0){
        long temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}
}