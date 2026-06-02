public class DigitFrequencyScore {
    public int digitFrequencyScore(int n) {
        int[] freq=new int[10];
        while(n>0){
            int r=n%10;
            freq[r]++;
            n/=10;
        }
        int sum=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                sum=sum+(freq[i]*i);
            }
        }
        return sum;
    }
}
