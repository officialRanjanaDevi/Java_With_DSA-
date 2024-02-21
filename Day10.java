//Game with String
import java.util.*;
public class Day10 {
    public static int minValue(String s, int k){
        //mapping frequencies of characters of string in hashmap
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        //adding frequecies into an arraylist and then sorting it in decreasing order
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
             arr.add(entry.getValue());
        }
        Collections.sort(arr, Collections.reverseOrder());
        //Removing frequencies one at a time till k<0
        while(k>0){
            int temp=arr.get(0);
            arr.remove(0);
            arr.add(temp-1);
            Collections.sort(arr, Collections.reverseOrder());
            k--;
        }
        //calculating the final value of string
        int ans=0;
        for(int i=0;i<arr.size();i++){
            ans+=arr.get(i)*arr.get(i);
        }
        return ans;
    }
    //Driver function
    public static void main(String []args){
        String s="aabccbcc";
        int k=3;
        System.out.println(minValue( s,k));
    }
}
