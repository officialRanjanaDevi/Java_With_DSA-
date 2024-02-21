 //Rat in a maze using Backtracking
public class Day1 {
    static int count =0;
    public static void path_of_rat(int arr[][],int row,int col,int brr[][]){
        //base case
        if(row<0 ||col<0 ||row>=arr.length||col>=arr.length){
            return;
           }
       if(arr[row][col]==0 ||brr[row][col]==1){
        return;
       }
        //main work
       if(row==4 &&col==4){
        count++;
        brr[4][4]=1;
        print(brr);
        brr[4][4]=0;
        return;
       }
       brr[row][col]=1;
       //recursively calling the function   up--> down--> left--> right
       path_of_rat(arr,row+1,col,brr);   
       path_of_rat(arr,row-1,col,brr);
       path_of_rat(arr,row,col-1,brr);
       path_of_rat(arr,row,col+1,brr);
        brr[row][col]=0;
        return;
    }

    //print the path in a 2Darray
    public static void print(int brr[][]){
        System.out.println("------------------------"+count+"--------------------");
        for(int i=0;i<5;i++){
            for(int j=0;j<brr[i].length;j++){
                System.out.print(brr[i][j]+"   ");
            }
            System.out.println();
        }
    }
   public static void main(String []args){
    int arr[][]={{1,1,1,0,1},
                 {1,1,0,1,0},
                 {1,1,1,0,1},
                 {1,0,1,1,1},
                 {1,1,1,1,1}};
   
    int brr[][]=new int[5][5];
    path_of_rat(arr,0,0,brr);
   } 
}
