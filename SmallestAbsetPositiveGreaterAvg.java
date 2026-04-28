import java.util.HashSet;

public class SmallestAbsetPositiveGreaterAvg {
    public int smallestAbsent(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       int sum=0;
       for(int n:nums){
        set.add(n);
        sum+=n;
       }
       int avg=(sum/nums.length)+1;
       if(avg<=0){
        avg=1;
       }
       while(set.contains(avg)){
        avg++;
       }
       return avg;
    }
}
