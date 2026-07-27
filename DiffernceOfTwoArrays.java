import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DiffernceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 =new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
          for(int n:nums2){
            set2.add(n);
        }
        for(int n:set1){
            if(!set2.contains(n)){
                list1.add(n);
            }
        }
           for(int n:set2){
            if(!set1.contains(n)){
                list2.add(n);
            }
        }
        List<List<Integer>> outerList =new ArrayList<>();
        outerList.add(list1);
        outerList.add(list2);
        return outerList;
    }
}
