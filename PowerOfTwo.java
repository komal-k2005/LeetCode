class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean flag=false;
        if(n<=0){
            flag=false;
        }
      for(int i=0;i<=31;i++){
        if(n == Math.pow(2,i)){
            flag=true;
            break;
        }
      }
      return flag;
}}
public class PowerOfTwo{
    public static void main(String args[]){
        Solution s=new Solution();
        int n=1;
        s.isPowerOfTwo(n);
    }
}