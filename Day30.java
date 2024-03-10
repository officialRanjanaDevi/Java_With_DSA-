import java.util.*;
public class Day30 {
    
    public static String removeDuplicates(String str) {
            HashMap<Character,Integer>map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                if(map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);
                }else{
                    map.put(str.charAt(i),1); 
                }
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<str.length();i++){
                if(map.containsKey(str.charAt(i))){
                   
                        sb.append(str.charAt(i));
                        map.remove(str.charAt(i));
                    }
               }
            String ans=sb.toString();
            System.out.println(sb);
            return ans;
        }
    public static void main(String[]args){
      String str="geEksforGEeks";
      System.out.println(removeDuplicates(str));
    }
    
}
