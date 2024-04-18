public class Day69 {
        public int helper(int grid[][],int row,int col){
            int sum=0;
            if((row<grid.length-1 && grid[row+1][col]==0) || row==grid.length-1){
                sum++;
            }
            if(row==0 ||(row>0 && grid[row-1][col]==0)){
                sum++;
            }
             if((col<grid[0].length-1 && grid[row][col+1]==0) || col==grid[0].length-1){
                sum++;
            }
            if(col==0 ||(col>0 && grid[row][col-1]==0)){
                sum++;
            }
            return sum;
        }
        public int islandPerimeter(int[][] grid) {
            int count=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                       count+= helper(grid,i,j);
                    }
                }
            }
            return count;
        }
}
