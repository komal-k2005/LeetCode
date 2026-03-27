public class ThreeDivisor {
    public boolean isThree(int n) {
      int i=1;
      int count=0;
      while(i<=n){
        if(n%i == 0){
            count++;
        }
        i++;
        if(count>3){
            return false;
        }
      }
      return count==3;
    }
}
    
