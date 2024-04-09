class Day60 {
    public int timeRequiredToBuy(int[] tickets, int k) {
      int count=0;
      int i=0;
      int n=tickets.length;
      while(tickets[k]>0){
        if(tickets[i%n]>0){
            tickets[i%n]=tickets[i%n]-1;
            count++;
        }
        i++;
      }  
      return count;
    }
}