import  java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
public class FindMissingElement {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
            set.add(n);
        }
        while(min<=max){
            if(!set.contains(min)){
                l.add(min);
            }
            min++;
        }
        return l;
       
    }
}