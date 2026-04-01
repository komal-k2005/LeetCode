public class SumOfDigitInBaseK {

    public int sumBase(int n, int k) {
        int sum=0;
        int r=0;
        while(n>0){
            r=n%k;
            sum+=r;
            n/=k;

        }
        return sum;
    }
}
    
