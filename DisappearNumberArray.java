public class DisappearNumberArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        boolean[] num=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            num[nums[i]]=true;
        }
        for(int i=1;i<=nums.length;i++){
            if(!num[i]){
                list.add(i);
            }
        }
        return list;
}  
}
