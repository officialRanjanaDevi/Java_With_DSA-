public class Day54 {
        public boolean valid(char[][]board, String word,int row,int col,int k,int [][]visited){
            if(k==word.length()){
                return true;
            }
            if(row<0||row>=board.length||col<0||col>=board[0].length||visited[row][col]==1||board[row][col]!=word.charAt(k)){
                return false;
            }
            visited[row][col]=1;
            if(valid(board,word,row,col-1,k+1,visited)||
            valid(board,word,row+1,col,k+1,visited)||
            valid(board,word,row,col+1,k+1,visited)||
            valid(board,word,row-1,col,k+1,visited)){
                return true;
            }
            visited[row][col]=0;
            return false;
        }
        public boolean exist(char[][] board, String word) {
            int n=board.length;
            int m=board[0].length;
            int visited[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(valid(board,word,i,j,0,visited)){
                        return true;
                    }
                }
            }
            return false;
        } 
}

