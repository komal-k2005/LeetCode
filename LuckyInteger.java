
public class LuckyInteger {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int res=-1;
        for(int n:map.keySet()){
            if(n==map.get(n)){
                res=Math.max(res,n);
            }
        }
        return res;
        }
}