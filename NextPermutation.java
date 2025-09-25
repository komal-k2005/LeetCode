class Solution {
    public void nextPermutation(int[] nums) {
        // code here
        int n=nums.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }
        reverse(nums,pivot+1,n-1);
    }
    private static void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
class NextPermutation{
    public static void main(String args[]){
        Solution s=new Solution();
        int[] arr={2,4,1,7,5,0};
        s.nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
        
}