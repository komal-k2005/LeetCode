public class MajorityElement {
    public int majorityElement(int[] nums) {
     Arrays.sort(nums);
     int major=0;
     int major1=0;
     int res=nums[0];
     for(int i=0;i<nums.length-1;i++){
        if(nums[i] == nums[i+1]){
            major++;
        }
        else{
            major=1;
        }
            if(major>major1){
                major1=major;
                res=nums[i];
            }
        
     }
        return res;
    }
}
