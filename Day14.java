import java.util.*;
class Day14 {
    public static List<List<String>> groupAnagrams(String[] strs) {
     List<List<String>> result =new ArrayList<>();
        String arr[] = new String[strs.length];
        for(int i=0;i<strs.length;i++){
            char temp[] =strs[i].toCharArray();
            Arrays.sort(temp);
            arr[i]=String.valueOf(temp);
        }
         //strs[]={eat,  tea ,   tan ,  ate ,  nat ,bat}
        //  arr[]={aet,  aet ,   ant  ,aet  ,ant  ,abt}
       HashMap<String, ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
       for(int i=0;i<strs.length;i++){
           if(map.containsKey(arr[i])){
               ArrayList<String> list=map.get(arr[i]);
               list.add(strs[i]);
               map.put(arr[i],list);
           }else{
               ArrayList<String>list=new ArrayList<>();
               list.add(strs[i]);
               map.put(arr[i],list);
               result.add(list);
           }    
       }
       return result;
   }
   public static void main(String []args){
    String strs[]={"eat","tea" ,"tan" ,  "ate" ,  "nat" ,"bat"};
    List<List<String>> list=groupAnagrams(strs);
    System.out.print("[ ");
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+"  ");
    } 
    System.out.print(" ]");
   }
}