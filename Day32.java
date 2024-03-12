import java.util.*;
public class Day32 {
        public void posrecursion(int N,List<Integer> arr,int num){
             if(N==num){
                arr.add(N);
               return; 
            }
            arr.add(N);
            posrecursion(N+5,arr,num);
        }
        public void negrecursion(int N,List<Integer> arr){
            if(N<=0 ){
                arr.add(N);
                return;
            }            
            arr.add(N);
            negrecursion(N-5,arr);
        }
        public List<Integer> pattern(int N){
            // code here           
            List<Integer> arr=new ArrayList<>();
            if(N<=0 ){
                arr.add(N);
                return arr;
            }
            negrecursion(N,arr);
            int n=arr.get(arr.size()-1);
            posrecursion(n+5,arr,N);            
            return arr;
        }    
}
