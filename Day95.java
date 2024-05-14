public class Day95 {
        public int getgold(int [][]grid,int i,int j){
            int ans=0;
            if(i<0||j<0||i>=grid.length||j>=grid[i].length||grid[i][j]==0){
                return 0;
            }
            int curr=grid[i][j];
            grid[i][j]=0;
            int top=getgold(grid,i-1,j);
            int bottom=getgold(grid,i+1,j);
            int left=getgold(grid,i,j-1);
            int right=getgold(grid,i,j+1);
            ans=curr+Math.max(Math.max(left,right),Math.max(top,bottom));
              grid[i][j]=curr;
            return ans;
        }
        public int getMaximumGold(int[][] grid) {
            int max=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    if(grid[i][j]!=0){
                        max=Math.max(max,getgold(grid,i,j));
                    }
                }
            }
            return max;
        }
}
