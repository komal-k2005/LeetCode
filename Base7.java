public class Base7{
    public String convertToBase7(int num) {
        String sum="";
        int n=Math.abs(num);
        if(num==0){
            return "0";
        }
        while(n>0){
            sum=(n%7)+sum;
            n/=7;
        }
        if(num<0){
            sum="-"+sum;
        }
        return  sum;
    }
}


