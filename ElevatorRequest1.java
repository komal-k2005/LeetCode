public class ElevatorRequest1 {
     public int elevatorRequests(int n, int[] requests) {
        int current=0;
        int sum=0;
        for(int i=0;i<requests.length;i++){
            sum+=Math.abs(current-requests[i]);
            current=requests[i];
            
        }
        return sum;
    }
}