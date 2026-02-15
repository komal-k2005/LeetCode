public class DiagonalPrime {
    public int diagonalPrime(int[][] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
                if(isPrime(nums[i][i])){
                    m=Math.max(m,nums[i][i]);
                }
                if(isPrime(nums[i][nums.length-1-i])){
                    m=Math.max(m,nums[i][nums.length-1-i]);
                }
              } 
              return m; 
            }
            public static boolean isPrime(int n){
                if (n<=1){
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
