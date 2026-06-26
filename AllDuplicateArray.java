import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class AllDuplicateArray{
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                list.add(nums[i]);
            }
            set.add(nums[i]);
        }
        return list;
}
}