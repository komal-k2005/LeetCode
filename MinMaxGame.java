public class MinMaxGame{
    public int minMaxGame(int[] nums) {
       while(nums.length>1){
        int n=nums.length;
        int[] newnum=new int[n/2];
        for(int i=0;i<n/2;i++){
            if(i%2==0){
                newnum[i]=Math.min(nums[2 * i], nums[2 * i + 1]);
            }
            else{
                newnum[i]=Math.max(nums[2 * i], nums[2 * i + 1]);
            }}
            nums=newnum;
        }
        return nums[0];
    }
}
