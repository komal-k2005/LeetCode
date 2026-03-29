public class ArrangingCoins {
    public int arrangeCoins(int n) {
        long sum=0;
        long i=1;
        while(sum<=n){
            sum=sum+i;
            if(sum>n){
                return (int)i-1;
            }
            i++;
        }
        return (int)i-1;
    }
}

