import java.util.*;
public class InterSectionOfTwoArray2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(nums1.length>i && nums2.length>j){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] arr=new int[list.size()];
        for(int k=0;k<list.size();k++){
            arr[k]=list.get(k);
        }
        return arr;
    }
}

