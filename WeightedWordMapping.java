public class WeightedWordMapping {
 public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str=new StringBuilder();
        for(String s:words){
             int sum=0;
            for(char ch:s.toCharArray()){
               sum=weights[ch-'a']+sum;
            }
            int r=sum%26;
            str.append((char)('z'-r));
        }
        return str.toString();
    }
}