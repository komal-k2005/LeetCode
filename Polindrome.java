class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int rev=0;
        int r;
        boolean flag;
    while(x>0){
    r=x%10;
    rev=rev*10+r;
    x=x/10;
    }
    
    if(num==rev){
        flag=true;
    }
    else{
        flag=false;
    }
    return flag;
    }
}
public class Polindrome{
    public static void main(String args[]){
        Solution s=new Solution();
        int x= -123;
        s.isPalindrome(x);
    }
}