public class SmallestDivisibleProduct {
    public int smallestNumber(int n, int t) {
        while(n>0){
            int sum=sumOfNum(n);
            if(sum%t==0){
                break;
            }
            n++;
        }
        return n;
    }
    public static int sumOfNum(int n){
        int p=1;
        while(n>0){
            int r=n%10;
            p*=r;
            n/=10;
        }
        return p;
    }
}