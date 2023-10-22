package back_tracking.chess;

import java.util.*;



public class n_queen_row_vary {

    public static boolean isSafe(char[][] board, int row, int col, int n) {
        // check row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q')
                return false;
        }
        // check col
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // up right
       for(int i=row,j=col; i>=0 && j<n ; i--,j++){
        if(board[i][j]=='Q') return false;
       } 

        // up left
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // down right
        for (int i = row, j = col; i < n && j < n; i++, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        // down left
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;

    }

    public static void nQueens(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X';
            }

        }
    }

    public static void main(String args[]) {
        System.out.print("Enter the size of matrix: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        

        char board[][] = new char[n][n];

        // intialize the baard with 'X'->empty
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0); // row to decide in which row to be placed
        sc.close();
    }


}
