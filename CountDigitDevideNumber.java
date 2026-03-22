public class CountDigitDevideNumber {
    public int countDigits(int num) {
        int count=0;
        int n=num;
        int r=0;
        while(n>0){
            r=n%10;
            if(r!=0 && num%r == 0){
                count++;
            }
            n/=10;
        }
        return count;
    }
}
