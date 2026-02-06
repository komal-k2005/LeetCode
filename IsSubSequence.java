public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        int m=s.length()+1;
        int n=t.length()+1;
        int[][] arr=new int[m][n];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return arr[m-1][n-1] == s.length();
    }
}

