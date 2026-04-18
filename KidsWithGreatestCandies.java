import java.util.ArrayList;
import java.util.List;
public class KidsWithGreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int i:candies){
            max=Math.max(i,max);
        }
        for(int c:candies){
            if((c+extraCandies)>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
