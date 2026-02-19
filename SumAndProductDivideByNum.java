public class SumAndProductDivideByNum {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mult=1;
        int r=0;
        int newnum=n;
        while(n>0){
           r=n%10;
           sum+=r;
           mult*=r; 
           n/=10;
        }
        return newnum%(sum+mult) == 0;
    }
}

