
//Rotate 2D array 90 degree clockwise
public class Day8 {
    public static void rotate(int[][] matrix) {
        // converting 2Darray into its transpose by swapping 
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){               
                int temp=matrix[i][j];                        
                matrix[i][j]=matrix[j][i];                   
                matrix[j][i]=temp;
            }
        }
        //Swapping starting cols with respective ending cols till col!=matrix.length
        for(int i=0;i<matrix.length/2;i++){
            for(int j=0;j<matrix.length;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[j][matrix.length-1-i];
                matrix[j][matrix.length-1-i]=temp;
            }
        }
     }
      //driver function
     public static void main(String []args){
         int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
         rotate(matrix);

         //print the final rotated array
         System.out.print("[");
         for(int i=0;i<matrix.length;i++){
              System.out.print("[");
             for(int j=0;j<matrix[i].length;j++){
                 System.out.print(matrix[i][j]+",");
             }
             System.out.print("],");
         }
          System.out.print("]");
     }                       
}








