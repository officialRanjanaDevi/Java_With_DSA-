//Bitwise AND (&) operation in a given range
public class Day12 {
    public static int rangeBitwiseAnd(int left, int right) {    
        int count = 0;
           //performing right shift operation till left!=right
           while (left != right) {
               left >>= 1; 
               right >>= 1; 
               count++;
           }
           return (left << count);
    } 
    //Driver code
    public static void main(String[]args){
       int left=17;
       int right=163393;
       System.out.println(rangeBitwiseAnd(left,right));
    }
}
