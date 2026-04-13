public class DegreeOfVertex{
    public int[] findDegrees(int[][] matrix) {
        int[] res=new int[matrix[0].length];
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            res[i]=count;
            count=0;
        }
        return res;
    }
}
