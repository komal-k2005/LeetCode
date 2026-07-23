public class ExcelSheetColumnNum {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        for(char ch:columnTitle.toCharArray()){
           int res=ch-'A'+1;
           ans=ans*26+res;
        }
        return ans;
    }
}