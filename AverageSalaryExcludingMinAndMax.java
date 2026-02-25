public class AverageSalaryExcludingMinAndMax {
    public double average(int[] salary) {
        int min=salary[0];
        int max=salary[0];
        int sum=0;
        for(int i=0;i<salary.length;i++){
            min=Math.min(salary[i],min);
            max=Math.max(salary[i],max);
            sum+=salary[i];
        }
        return (double)(sum-min-max)/(salary.length-2);
}
}
