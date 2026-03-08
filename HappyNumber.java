import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
    int num=n;
    h.add(num);
    while(num!=1){
        num=squareOfNum(num);
        if(h.contains(num)){
            return false;
        }
         h.add(num);
    }
    return true;

  }
  public static int squareOfNum(int n){
    int r=0;
    int sum=0;
    while(n>0){
        r=n%10;
        sum=sum+r*r;
        n=n/10;
    }
    return sum;
  }
}
