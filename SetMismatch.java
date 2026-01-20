import java.util.Arrays;
import java.util.TreeMap;

public class SetMismatch{
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=1;i<=nums.length;i++){
            map.put(i,0);
        }

        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int k: map.keySet()){
            if(map.get(k)==0){
                ans[1] = k;
            }else if(map.get(k)==2){
                ans[0] = k;
            }
        }

        return ans;
    }
}
