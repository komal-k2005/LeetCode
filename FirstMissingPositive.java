import java.util.HashSet;

public class FirstMissingPositive{
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int i=1;
        while(i<=nums.length){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
        return i;
        
    }
}
