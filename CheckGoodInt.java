public class CheckGoodInt{
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sqrSum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            sqrSum=sqrSum+(r*r);
            n/=10;
        }
        return (sqrSum-sum)>=50;
    }
}
