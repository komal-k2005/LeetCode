class Solution {
    public int addDigits(int num) {
        int sum=0;
        int r;
        int s=0;
        while(num>0){
            r=num%10;
            sum=r+sum;
            num=num/10;
        }
        while(sum>0){
            r=sum%10;
            s=s+r;
            sum=sum/10;
        }
        return s;
    }
}
public class AddDigit{
    public static void main(String args[]){
        Solution s=new Solution();
        int num=38;
        s.addDigits(num);
    }
}