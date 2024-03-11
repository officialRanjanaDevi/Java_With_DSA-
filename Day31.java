import java.util.HashMap;
import java.util.Map;
public class Day31 {
    public String customSortString(String order, String s) {
       HashMap<Character,Integer>map=new HashMap<>(); 
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }else{
               map.put(ch,1);
           }
       }
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<order.length();i++){
            char ch =order.charAt(i);
            if(map.containsKey(ch)){
                int count=map.get(ch);
                while(count-->0){
                    sb.append(ch);
                }
                map.remove(ch);
            }
       }
       for(Map.Entry<Character,Integer>entry: map.entrySet()){
           while(entry.getValue()>0){
               sb.append(entry.getKey());
               entry.setValue(entry.getValue()-1);
           }   
       }
       return sb.toString();
    }
}

