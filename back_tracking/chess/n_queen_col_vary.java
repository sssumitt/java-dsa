package back_tracking.chess;

import java.util.Scanner;

public class n_queen_col_vary {

    public static boolean isSafe(char[][]board,int row, int col) {

        int n= board.length;
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

    public static void nQueens(char[][] board, int col) {
    
        int n = board.length;

        // base case
        if (col == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;

        }

        //backtracking
        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 'Q';
                nQueens(board, col + 1);
                board[i][col] = 'X';

            }

        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of matrix: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);// varing the col
        sc.close();
    }

}
