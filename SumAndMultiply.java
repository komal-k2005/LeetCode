import java.util.ArrayList;
public class SumAndMultiply {
    public long sumAndMultiply(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(0<n){
            int r=n%10;
            if(r!=0){
                list.add(r);
            }
            n/=10;
        }
        int sum=0;
        long res=0;
        for(int i=list.size()-1;i>=0;i--){
            res=(res*10)+list.get(i);
             sum+=list.get(i);
        }
        return res*sum;
    }
}