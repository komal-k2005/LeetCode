public class MaskingPersonalInfo {
    public String maskPII(String s) {
        if(s.contains("@")){
           s=s.toLowerCase();
            int a=s.indexOf('@');
            return s.charAt(0)+"*****"+s.charAt(a-1)+s.substring(a);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        int n=sb.length();
        String res="***-***-"+sb.substring(n-4);
        int code=n-10;
        if(code==0){
            return res;
        }
        StringBuilder sb1=new StringBuilder();
        sb1.append('+');
        for(int i=0;i<code;i++){
            sb1.append('*');
        }
        sb1.append('-');
        return sb1.append(res).toString();
            }
}