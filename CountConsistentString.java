public class CountConsistentString{
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String s:words){
            int flag=0;
            for(char c:s.toCharArray()){
               if(!allowed.contains(String.valueOf(c))){
                flag=0;
                 break;
               }
               flag++;
            }
            if(flag>0){
            count++;
        }
        }
        return count;
    }
}