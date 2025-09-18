class Solution {
    public int fib(int n) {
        int f1=0;
        int f2=1;
        int f3=f1+f2;
        if(n==0){
            f3=0;
        }
        for(int i=1;i<n;i++){
             f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
}
public class Fiboncci{
    public static void main(String args[]){
        Solution s=new Solution();
        int n=2;
        s.fib(n);
    }
}