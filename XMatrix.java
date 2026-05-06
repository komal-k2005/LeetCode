public class XMatrix {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               boolean isDiagonal=(i==j || i+j==n-1);
               if(isDiagonal && grid[i][j]==0){
                return false;
               }
               if(!isDiagonal && grid[i][j]!=0){
                return false;
               }
            }}
        return true;
    }
}
