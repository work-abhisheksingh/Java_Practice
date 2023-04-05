class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
    
    private boolean solve(char[][] board, int row, int col) {
        if (row == 9) {
            return true; // entire board has been filled
        }
        
        int nextRow = col == 8 ? row + 1 : row;
        int nextCol = col == 8 ? 0 : col + 1;
        
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol); // cell already filled, move on to next cell
        }
        
        for (char num = '1'; num <= '9'; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board, nextRow, nextCol)) {
                    return true; // solution found
                }
                board[row][col] = '.'; // backtrack and try a different number
            }
        }
        
        return false; // no valid number found for this cell
    }
    
    private boolean isValid(char[][] board, int row, int col, char num) {
        // check row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        
        // check 3x3 sub-box
        int subBoxRow = (row / 3) * 3;
        int subBoxCol = (col / 3) * 3;
        for (int i = subBoxRow; i < subBoxRow + 3; i++) {
            for (int j = subBoxCol; j < subBoxCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        
        return true; // no conflicts found
    }
}
