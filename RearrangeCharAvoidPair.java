public class RearrangeCharAvoidPair {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder xLetter=new StringBuilder();
        StringBuilder yLetter=new StringBuilder();
        StringBuilder other=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch==y){
                yLetter.append(ch);
            }
            else if(ch==x){
                xLetter.append(ch);
            }
            else{
                other.append(ch);
            }
        }
        return yLetter.append(other).append(xLetter).toString();
    }
}