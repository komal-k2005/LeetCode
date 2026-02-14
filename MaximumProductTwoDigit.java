public class MaximumProductTwoDigit {
    public int maxProduct(int n) {
        int max=0;
        int max1=0;
        int r=0;
        while(n>0){
            r=n%10;
            if(r>max1){
                max=max1;
                max1=r;
            }
            else if(max<r){
                max=r;
            }   
            n/=10;
        }
        return max*max1;
    }
}