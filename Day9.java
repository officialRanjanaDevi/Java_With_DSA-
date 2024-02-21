//Buy and sell stocks to get max profit;

public class Day9 {
    public static void main(String args[]){
        int arr[]={5,4,1,2,4,2};
        int buy=Integer.MAX_VALUE; //buy day of stocks
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(buy<arr[i]){
                 int profit=arr[i]-buy; //current profit
                 maxprofit=Math.max(maxprofit, profit);
            }else{
                 buy=arr[i];
            }
        }
        System.out.println(maxprofit);
    }
}
