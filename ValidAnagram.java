public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
      /* char[] ch=s.toCharArray();
       char[] ch1=t.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ch1);
       return Arrays.equals(ch1,ch); */
       int[] count=new int[26];
       if(s.length() != t.length()){
        return false;
       }
       else{
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
       }
       for(int c:count){
        if(c != 0){
            return false;
        }
       }
       return true;
    }
}

