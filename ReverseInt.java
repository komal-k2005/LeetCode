class Solution {
    public int reverse(int x) {
        int num=x;
        int r,reverse;
        int result=0;
     while(x != 0){
        r=x%10;
        result= result*10 + r;
        x=x/10;
     }
    
     return  result;   
    }
}
public class ReverseInt{
    public static void main(String args[]){
        Solution s=new Solution();
        int x=123;
        int result;
        result=s.reverse(x);
       System.out.println("revrese number is:"+result);
    }
}