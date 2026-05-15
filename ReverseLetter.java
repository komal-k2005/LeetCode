public class ReverseLetter{
    public String reverseOnlyLetters(String s) {
        char[] ar=s.toCharArray();
        int i=0;
        int j=ar.length-1;
        while(i<j){
            if(!Character.isLetter(ar[i])){
                i++;
            }
            else if(!Character.isLetter(ar[j])){
                j--;
            }
            else{
                char temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                i++;
                j--;
            }
    }
       return new String(ar);
    }
}