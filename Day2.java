//Keypad Combinations using Backtracking
import java.util.*;
   public class Day2 {
   
        final static char alphabet[][]={ {},{},
                                     {'a','b','c'},
                                     {'d','e','f'},
                                     {'g','h','i'},
                                     {'j','k','l'},
                                     {'m','n','o'},
                                     {'p','q','r','s'},
                                     {'t','u','v'},
                                     {'w','x','y','z'} };
        public static void keypad_combinations(String s,String str,int i,int length){
            //base case
            if(i==length){
                System.out.println(str);
                return;
            }
            //recursive work
           char[] letter=alphabet[s.charAt(i)-'0'];
            for(int k=0;k<letter.length;k++){
                keypad_combinations(s,str+letter[k],i+1,length);
            }
            
    
        }
        public static void main(String []args){
            Scanner input =new Scanner (System.in);
            //input string should contain 2<=integers<=9 
            String s=input.next();
            input.close();
            String str="";
            int length=s.length();
            keypad_combinations(s,str,0,length);
        }
    
       
   }
