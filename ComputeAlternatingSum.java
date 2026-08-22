public class ComputeAlternatingSum {
    public int alternatingSum(int[] nums) {
        int sum=0;
        int s1=0;
        for(int i=0;i<nums.length;i+=2){
            if(i<nums.length-1){
                s1=nums[i]-nums[i+1];
                sum+=s1;
            }
            else{
                sum+=nums[i];
            }
            
        }
        return sum;
    }

}