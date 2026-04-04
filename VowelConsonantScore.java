public class VowelConsonantScore {
    public int vowelConsonantScore(String s) {
        int c=0;
        int v=0;
      
        s=s.toLowerCase();
      for(char ch:s.toCharArray()){
        if(Character.isLetter(ch)){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            v++;
        }
        else{
            c++;
        }
      }}
      return (c!=0)?v/c:0;
    }
}
