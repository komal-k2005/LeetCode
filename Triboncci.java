class Solution {
    public int tribonacci(int n) {
        int f1=0;
        int f2=1;
        int f3=1;
        int f4=f1+f2+f3;
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
      else{
          for(int i=2;i<n;i++){
            f4=f1+f2+f3;
            f1=f2;
            f2=f3;
            f3=f4;
        }
        return f4;
      }
    }
}
public class Triboncci{
public static void main(String args[]){
    Solution s=new Solution();
    int n=4;
    System.out.println(s.tribonacci(n));
}
}