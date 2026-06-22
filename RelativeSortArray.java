public class RelativeSortArray{
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max=Integer.MIN_VALUE;
        for(int n:arr1){
            max=Math.max(n,max);
        }
        int[] freq=new int[max+1];
        for(int n:arr1){
            freq[n]++;
        }
        int i=0;
        for(int n:arr2){
            while(freq[n]>0){
                arr1[i++]=n;
                freq[n]--;
            }
        }
        int n=0;
        while(n<=max){
            while(freq[n]>0){
                arr1[i++]=n;
                freq[n]--;
            }
            n++;
        }
        return arr1;
    }
}