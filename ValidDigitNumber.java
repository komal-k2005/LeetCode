public class ValidDigitNumber{
    public boolean validDigit(int n, int x) {
        int r=0;
        int count=0;
        while(n>0){
            r=n%10;
            if(r==x){
                count++;
            }
            n/=10;
        }
        if(count>0 && r!=x){
            return true;
        }
        return false;
    }
}