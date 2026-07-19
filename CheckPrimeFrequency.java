public class CheckPrimeFrequency{
    public boolean checkPrimeFrequency(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
       }
       for(int n:map.values()){
        if(isPrime(n)){
            return true;
        }
       }
       return false;
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}