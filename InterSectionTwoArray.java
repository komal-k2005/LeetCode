import java.util.*;
public class InterSectionTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(nums1.length>i && nums2.length>j){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else {if(list.isEmpty() || list.get(list.size()-1) != nums1[i] ){
                list.add(nums1[i]);}
                i++;
                j++;
            }
        }
        int[] arr=new int[list.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]=list.get(k);
        }
        return arr;
    }
}
