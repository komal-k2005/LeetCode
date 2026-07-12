import java.util.List;
import java.util.ArrayList;
public class ReformateString{
    public String reformat(String s) {
     List<Character>c=new ArrayList<>();
     List<Character>d=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                d.add(ch);
            }
            else{
                c.add(ch);
            }
        }
        if(Math.abs(c.size()-d.size())>1){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        boolean isFirst=c.size()>=d.size();
        int i=0,j=0;
        while(j<d.size() || i<c.size()){
            if(isFirst && c.size()>i){
                sb.append(c.get(i++));
            }
            if(j<d.size()){
                sb.append(d.get(j++));
            }
            if(!isFirst && c.size()>i){
                sb.append(c.get(i++));
            }
        }
        return sb.toString();
    }
}