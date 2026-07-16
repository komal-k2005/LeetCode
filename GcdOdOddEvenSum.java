public class GcdOdOddEvenSum {
    public int gcdOfOddEvenSums(int n) {
        int k=1;
        int sumOdd=0;
        int sumEven=0;
       for(int i=0;i<n;i++){
        sumOdd+=k++;
        sumEven+=k++;
       }
       while(sumEven!=0){
        int r=sumOdd%sumEven;
        sumOdd=sumEven;
        sumEven=r;
       }
       return sumOdd;
    }
}
