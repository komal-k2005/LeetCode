public class DIStringMatch{
    public int[] diStringMatch(String s) {
        int[] arr=new int[s.length()+1];
        int n=s.length();
        int m=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=m++;
            }
            else if(s.charAt(i)=='D'){
                arr[i]=n--;   
            }
        }
        arr[s.length()]=m;
        return arr;
    }
}
