public  class MaxIceCreamBar {
    public int maxIceCream(int[] costs, int coins) {
        int max=Integer.MIN_VALUE;
        for(int n:costs){
            max=Math.max(n,max);
        }
        int[] freq=new int[max+1];
        for(int n:costs){
            freq[n]++;
        }
        int count=0;
        for(int i=1;i<max+1;i++){
            while(freq[i]>0 && i<=coins){
                coins-=i;
                count++;
                freq[i]--;
            }
        }
        return count;
    }
}
