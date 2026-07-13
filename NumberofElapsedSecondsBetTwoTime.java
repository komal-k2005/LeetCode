public class NumberofElapsedSecondsBetTwoTime {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int end=inSeconds(endTime);
        int start=inSeconds(startTime);
        return end-start;
    }
    public static int inSeconds(String time){
        String[] t=time.split(":");
        int h=Integer.parseInt(t[0]);
        int m=Integer.parseInt(t[1]);
        int s=Integer.parseInt(t[2]);
        return  h*3600+m*60+s;
    }
}
