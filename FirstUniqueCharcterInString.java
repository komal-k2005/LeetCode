public class FirstUniqueCharcterInString {
    public int firstUniqChar(String s) {
         boolean unique=false;
         int u=0;
        for(int j=0;j<s.length();j++){
        for(int i=0;i<s.length();i++){
            if(j != i && s.charAt(j) == s.charAt(i)){
                unique=true;
                break;
            }
        }
        if(!unique){
            return j;
                }
                unique=false;
        }
        
       return -1;
    }
}
