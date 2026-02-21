public class rimeNUmberSetOfBitsBinaryRepresentation {
  
    public int countPrimeSetBits(int left, int right) {
        int num;
        int result=0;
        while(left<=right){
            int count=0;
            num=left;
            while(num>0){
                if(num%2 ==1){
                    count++;
                }
                num/=2;}
            if(isPrime(count)){
                result++;
            }
            count=0;
            left++;
        }
        return result;
    }
    public static boolean isPrime(int n){
        if(n<= 1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
