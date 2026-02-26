import java.util.HashSet;

public class NRepeatedElementIn2NArray {
    public int repeatedNTimes(int[] nums) {
       HashSet<Integer> h=new HashSet<>();
       for(int n:nums){
        if(h.contains(n)){
            return n;
        }
        h.add(n);
       }
      /* for(int j=0;j<nums.length;j++){
     for(int i=j+1;i<nums.length;i++){
        if(nums[i]==nums[j]){
            return nums[i];
        }
     }}
     return -1;*/
     return -1;
    }

    
}
