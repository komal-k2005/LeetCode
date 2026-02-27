public class ToLowerCase {
    public String toLowerCase(String s) {
       StringBuilder str=new StringBuilder();
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            str.append(ch);
        }
        return str.toString();
        //return s.toLowerCase();
    }
}

