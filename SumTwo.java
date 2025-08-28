class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                    sum=numbers[i]+numbers[j];
                    if(sum==target){
                        return new int[]{i+1,j+1};
                    }
            }
        }
        return new int[]{};
    }
}
public class SumTwo{
    public static void main(String args[]){
        Solution s=new Solution();
        int[] numbers={2,7,11,15};
        int target=9;
        s.twoSum(numbers,target);
    }
}