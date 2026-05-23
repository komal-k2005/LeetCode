public class AdjacentDigitDiff {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            int res=Math.abs(s.charAt(i)-s.charAt(i+1));
            if(res>2){
                return false;
            }
        }
        return true;
    }
}
