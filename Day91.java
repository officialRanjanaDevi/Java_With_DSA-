public class Day91 {
        class Helper implements Comparable<Helper>{
            int x;
            int y;
            double fraction;
            public Helper(int x,int y,double fraction){
                this.x=x;
                 this.y=y;
                 this.fraction=fraction; 
            }
            @Override
            public int compareTo(Helper h2){
                return Double.compare (this.fraction,h2.fraction);
            }
        }
        public int[] kthSmallestPrimeFraction(int[] arr, int k) {
            PriorityQueue <Helper> pq=new PriorityQueue<>();
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                     double fraction =(double)arr[i]/arr[j];
                     pq.add(new Helper(arr[i],arr[j],fraction));
                }
            }
            while(k-->1){
                pq.poll();
            }
            Helper ksmallest=pq.poll();
            return new int[]{ksmallest.x,ksmallest.y};
        }
}
