import java.util.ArrayList;
import java.util.List;

public class SeparateDigitInArray{
     public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
           for(char ch:s.toCharArray()){
            list.add(ch-'0');
           }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}