public class DistanceValueBetTwoArray{
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int n1:arr1){
            boolean valid=true;
            for(int n2:arr2){
                if(Math.abs(n1-n2)<=d){
                    valid=false;
                    break;
                }
            }
            if(valid){
                c++;
            }
        }
        return c;

    }
}