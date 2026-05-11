public class ConcateArrayWIthReverse {
    public int[] concatWithReverse(int[] nums) {
        int[] arr=new int[nums.length*2];
        int j=nums.length-1;
        for(int i=0;i<arr.length;i++){
            if(i<nums.length){
                arr[i]=nums[i];
            }
            else{
                arr[i]=nums[j];
                j--;
            }
        }
        return arr;
}
}
