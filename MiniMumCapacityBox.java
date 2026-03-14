public class MiniMumCapacityBox {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<min){
                min=Math.min(min,capacity[i]);
                index=i;
            }
        }
        return index;
    }
}
