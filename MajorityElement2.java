import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;w
public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int r=nums.length/3;
        for(int n:map.keySet()){
            if(map.get(n)>r){
                list.add(n);
            }
        }
        return list;
    }
}