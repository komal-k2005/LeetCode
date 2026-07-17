public class SumOfGCDPair{
    public long gcdSum(int[] nums) {
       int n=nums.length;
       int[] p=new int[n];
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        max=Math.max(nums[i],max);
        p[i]=gcd(nums[i],max);
       }
       Arrays.sort(p);
       long sum=0;
       int l=0;
       int r=n-1;
       while(l<r){
        sum+=gcd(p[l],p[r]);
        l++;
        r--;
       }
       return sum;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}