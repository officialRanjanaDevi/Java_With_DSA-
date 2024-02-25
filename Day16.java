//Longest common Prefix
import java.util.*;
class Solution {
    public static String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String s1= strs[0];
       String s2=strs[strs.length-1];
       int i=0;
       StringBuilder sb=new StringBuilder();
       while(i<s1.length() && i<s2.length()){
          if(s1.charAt(i)!=s2.charAt(i)){
                  String ans=sb.toString();
                  return ans;
          }else{
              sb.append(s1.charAt(i));
          }
          i++;
       }
       String ans=sb.toString();
       return ans;
    }
    public static void main(String []args){
     String strs[]={"flower","flow","flight"};
    System.out.println(longestCommonPrefix(strs));
    }
}