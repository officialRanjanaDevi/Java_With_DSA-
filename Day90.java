public class Day90 {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int n=happiness.length-1;
        int i=0;
        while(i<k){
            if((happiness[n]-i)>0){
                sum+=happiness[n]-i;
            }
            n--;
            i++;
        }
        return sum;
    }
}
