class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null ||grid.length==0){
            return 0;
        }
        int numIsland=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    numIsland++;
                    dfs(grid,i,j);
                }
            }
        }
        return numIsland;
    }
    private void dfs(char [][]grid,int i,int j){
        if(i<0||i>=grid.length|| j<0||j>=grid[0].length||grid[i][j]!='1'){
            return ;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j);  //bottom
        dfs(grid,i-1,j);  //top
        dfs(grid,i,j+1); //right
         dfs(grid,i,j-1);  //left

    }
}