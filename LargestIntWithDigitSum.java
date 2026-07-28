public class LargestIntWithDigitSum {
    public int largestInteger(int n, int s) {
        if(s>n*9){
            return -1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int d=Math.min(9,s);
            sb.append(d);
            s-=d;
        }
        return Integer.parseInt(sb.toString());
    }
}