public class SlowestKey{
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char ans=keysPressed.charAt(0);
        int max=releaseTimes[0];
        int duration=0;
        for(int i=1;i<releaseTimes.length;i++){
            duration=releaseTimes[i]-releaseTimes[i-1];
            char ch=keysPressed.charAt(i);
            if(duration>max || (duration==max && ans<ch)){
                ans=ch;
                max=duration;
            }
        }
        return ans;
    }
}