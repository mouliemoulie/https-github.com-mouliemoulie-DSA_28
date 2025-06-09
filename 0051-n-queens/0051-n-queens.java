class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        int row=0;
        return nqueens(row,board);
    }
    private List<List<String>> nqueens(int row,boolean[][] board){
        List<List<String>> res=new ArrayList<>();
        if(row==board.length){
            res.add(display(board));
            return res;
        }
        for(int col=0;col<board.length;col++){
            if(issafe(board,row,col)){
                board[row][col]=true;
                res.addAll(nqueens(row+1,board));
                board[row][col]=false;
            }
        }
        return res;
    }
    private boolean issafe(boolean[][] board,int r,int c){
        for(int i=r;i>=0;i--){
            if(board[i][c]) return false;
        }
        
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) { //diagonal left
            if (board[i][j]) return false;
        }

        for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++) { //diagonal right
            if (board[i][j]) return false;
        }

        return true;
    }
    private List<String> display(boolean[][] board){
        List<String> ways=new ArrayList<>();
        for(boolean[] row:board){
            StringBuilder qplace=new StringBuilder();
            for(boolean e:row){
                if(e) qplace.append("Q");
                else qplace.append(".");
            }
            ways.add(qplace.toString());
        }
        return ways;
    }

}