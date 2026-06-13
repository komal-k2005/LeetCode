public class MirrorDistanceOfInt {
     public int mirrorDistance(int n) {
        int rev=reverse(n);
        int res=Math.abs(n-rev);
        return res;
    }
    public static int reverse(int n){
        int sum=0;
        while(n>0){
            sum=sum*10+(n%10);
            n/=10;
        }
        return sum;
    }
}
