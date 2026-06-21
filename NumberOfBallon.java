public class NumberOfBallon {
  public int maxNumberOfBalloons(String text) {
        int[] num=new int[26];
        for(char ch: text.toCharArray()){
            num[ch-'a']++;
        }
        return Math.min(Math.min(Math.min(num['b'-'a'],num['a'-'a']),num['n'-'a']),Math.min(num['l'-'a']/2,num['o'-'a']/2));
    }
}