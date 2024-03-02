/*-----First element to occur k times------- */
import java.util.*;
class Day22{
    public static int firstElementKTime(int n, int k, int[] a) { 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
                if(map.get(a[i])==k){
                    return a[i];
                }
            }else{
                map.put(a[i],1);
            }
        }
        return -1;
    } 
    // Driver code
    public static void main(String []args){
        int a[]={1,5,7,3,5,1,7,7,1,3};
        int k=3;
        int n=a.length;
        System.out.println(firstElementKTime( n,k,a));
    }
}