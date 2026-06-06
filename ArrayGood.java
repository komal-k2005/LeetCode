public class ArrayGood{
    public boolean isGood(int[] nums){
        int n=nums.length;
        int[] seen=new int[n+1];
       for(int num:nums){
        if(num<1 || num>n-1){
            return false;
        }
        seen[num]++;
       }
        for(int i=1;i<n-1;i++){
            if(seen[i]!=1){
                return false;
            }
        }
        return seen[n-1]==2;
    }
}
