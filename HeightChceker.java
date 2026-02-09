import java.util.*;
public class HeightChceker {
    public int heightChecker(int[] heights) {
        int[] newarr=new int[heights.length];
        int count=0;
         for(int i=0;i<heights.length;i++){
            newarr[i]=heights[i];
        }
        Arrays.sort(newarr);
        for(int i=0;i<heights.length;i++){
           if(newarr[i] == heights[i]){
            continue;
           }
           else{
            count++;
           }
        }
        return count;
    }
}
