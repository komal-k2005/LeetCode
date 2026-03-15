import java.util.ArrayList;
import java.util.List;

public class SelfDevidingNumber {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        while(left<=right){
            if(selfDevideNumber(left)){
                l.add(left);
            }
            left++;
        }
        return l;
    }
    public static boolean selfDevideNumber(int n){
        int num=n;
        int r=0;
        while(n>0){
            r=n%10;
            if(r ==0 || num%r !=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}
