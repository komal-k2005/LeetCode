public class FizzBuzz 
     {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        int j=1;
        while(j<=n){
            String s = String.valueOf(j);
            if(j%3==0 && j%5==0){
                list.add("FizzBuzz");
            }
            else if(j%3==0){
                list.add("Fizz");
            }
            else if(j%5==0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(j));
            }
            j++;
        }
        return list;
            }
}