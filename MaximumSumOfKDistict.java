import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MaximumSumOfKDistict {
    public int[] maxKDistinct(int[] nums, int k) {
      HashSet<Integer> set=new HashSet<>();
      for(int n:nums){
        set.add(n);
      }
      List<Integer> list=new ArrayList<>(set);
      Collections.sort(list);
      int j=0;
      int size=Math.min(k,list.size());
      int[] a=new int[size];
      for(int i=list.size()-1;i>=0;i--){
        if(k>j){
            a[j]=list.get(i);
            j++;
        }
      }
      return a;
    }
}
