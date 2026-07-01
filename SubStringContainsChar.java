public class SubStringContainsChar {
    public int numberOfSubstrings(String s) {
        int count=0;
        int j=0;
        int n=s.length();
         int[] freq=new int[3];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+=n-i;
                freq[s.charAt(j)-'a']--;
                j++;
            }
        }
        return count;
    }
}