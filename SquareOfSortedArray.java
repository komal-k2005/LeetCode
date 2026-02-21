import java.util.*;
public class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        int temp=0;
        Arrays.sort(arr);
        return arr;
    }
}

