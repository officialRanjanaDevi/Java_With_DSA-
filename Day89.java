public class Day89 {
        public String[] findRelativeRanks(int[] score) {
            String arr[]=new String[score.length];
            PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    
            for(int i=0;i<score.length;i++){
                pq.add(score[i]);
            }
            
            int rank=1;
            HashMap<Integer,Integer> map=new HashMap<>();
            while(!pq.isEmpty()){
                 map.put(pq.remove(),rank);
                 rank++;
            }
    
            for(int i=0;i<score.length;i++){
                if(map.get(score[i])==1){
                    arr[i]="Gold Medal";
                }else if(map.get(score[i])==2){
                    arr[i]="Silver Medal";
                }else if(map.get(score[i])==3){
                     arr[i]="Bronze Medal";
                }else{
                    arr[i]=map.get(score[i]).toString();
                }
            }
            return arr;
        }
}
