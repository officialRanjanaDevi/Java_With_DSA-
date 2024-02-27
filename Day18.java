// subsequenses with sum ==k
import java.util.*;
public class Day18 {
    public static void printrecursively(int arr[] , int k,int i,ArrayList<Integer> list,int sum){
           //base case
            if(i==arr.length){
              if(sum==k){
                System.out.print(list +"   " );
              }
              return;
            }
           list.add(arr[i]);
           printrecursively( arr,  k, i+1,list,sum+arr[i]);
           list.remove(list.size()-1);
           printrecursively( arr,  k, i+1,list,sum);
    }
    
    public static void main(String[] args) {
       int arr[]={1,4,6,3,8};
      int k=11;
      ArrayList<Integer> list=new ArrayList<>();
      printrecursively( arr,  k, 0,list,0);
    }
}