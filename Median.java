
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int[] merge=new int[nums1.length + nums2.length];
     int k=0,i=0,j=0;
        while(j<nums2.length && i<nums1.length){
            if(nums1[i]< nums2[j]){
                merge[k++]=nums1[i++];
            }
            else{
                merge[k++]=nums2[j++];
            }
           
        }
  while (i < nums1.length) {
            merge[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merge[k++] = nums2[j++];
        }
     int len=merge.length;
   if (len % 2 == 0) {
       return (merge[len / 2] + merge[len / 2 - 1]) / 2.0;
     }
     else{
         return (merge[len / 2]);
     }
    
    }
}
public class Median{
    public static void main(String args[]){
        Solution s=new Solution();
      int[] nums1={1,2};
      int[] nums2={3,4};
      double r;
      r=s.findMedianSortedArrays(nums1,nums2);
      System.out.println(r);
    }
}