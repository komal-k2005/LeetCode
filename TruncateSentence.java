public class TruncateSentence{
    public String truncateSentence(String s, int k) {
      String[] sr= s.split(" ");
     StringBuilder sb=new StringBuilder();
      for(int i=0;i<k;i++){
        sb.append(sr[i]);
       if(i==k-1){
        break;
       }
       sb.append(" ");
      }
      return sb.toString();
    }
}