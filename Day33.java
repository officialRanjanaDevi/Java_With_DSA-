import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Day33 {
    public int firstUniqChar(String s) {
      Queue <Character> q1=new LinkedList<>();
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i); 
        q1.add(ch);
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
      }
      int count=0;
      while(!q1.isEmpty()){
          char ch= q1.remove();;
          if(map.containsKey(ch)){
              if(map.get(ch)==1){
                return count;
              }else{
               
                map.remove(ch);
              }     
          }
           count++; 
      }
      return -1;
    }
}

