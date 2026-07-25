public class MissingAndRepeatedValue {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int[] f=new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){
                f[grid[i][j]]++;
            }
        }
        int  missing=0;
        int repeated=0;
        for(int i=1;i<=size;i++){
            if(f[i]==2){
                repeated=i;
            }
            else if(f[i]==0){
                missing=i;
            }
        }
        return new int[]{repeated,missing};
    }
}