public class RotateString{
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        // return (s+s).contains(goal);
        String str=s+s;
        for(int i=0;i<str.length()-goal.length();i++){
            int j=0;
            while(j<goal.length() && str.charAt(i+j)==goal.charAt(j)){
                j++;
            }
           if(j==goal.length()){
            return true;
           }
        }
        return false;
    }
}