public class MatchingCharcacterBoth{
    public int firstMatchingIndex(String s) {
        int l=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(l-i)){
                return i;
            }
        }
        return -1;

    }
}
