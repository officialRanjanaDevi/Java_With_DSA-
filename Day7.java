//Least number of unique Integers after removing k elements
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Day7 {
   
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        //mapping frequencies of elements of array
         Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        //sorting freqencies in ascending order
        List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());
        elements.sort((a, b) -> a.getValue() - b.getValue());

        //removing k elements
        for (Map.Entry<Integer, Integer> entry : elements) {
            if (entry.getValue() <= k) {
                k -= entry.getValue();
                map.remove(entry.getKey());
            } else {
                break;
            }
        }
        return map.size();
    }
     //driver function
    public static void main(String[]args){
       int arr[]={4,3,1,1,3,3,2};
       int k=3;
       int ans= findLeastNumOfUniqueInts( arr,k);
    System.out.println(ans);
    }
}


