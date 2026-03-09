
public class CountingBits {
    public int[] countBits(int n) {
        int[] count=new int[n+1];
        int c=0;
        for(int i=0;i<=n;i++){
           c=binaryNumber(i);
           count[i]=c;

        }
        return count;
    }
    public static int binaryNumber(int n){
        int count=0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
}