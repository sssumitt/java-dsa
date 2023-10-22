package back_tracking.chess;

import java.util.*;

//tell the max no of knight that can be placed in a give nxn given chess board  and print all combinations

public class MaxKnightInNxNBorad {

    static int maxKnight = -1;

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        int i, j;

        int[] dx = { 1, 1, 2, 2, -1, -1, -2, -2 };
        int[] dy = { 2, -2, 1, -1, 2, -2, 1, -1 };

        for (int k = 0; k < 8; k++) {
            i = row + dx[k];
            j = col + dy[k];
            if (i >= 0 && i < n && j >= 0 && j < n && board[i][j] == 'K') {
                return false;
            }
        }

        return true;
    }

    public static void nKinght(char[][] board, int row, int col, int num) {

        int n = board.length;
        maxKnight= Math.max(num,maxKnight);
        if (row == n) {
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            
            System.out.println("Max Knights: " + num);
            System.out.println();
        
        

            return;
        }
        if (isSafe(board, row, col)) {

            board[row][col] = 'K';

            if (col != n - 1) {
                nKinght(board, row, col + 1, num + 1);
            }
            else {
                nKinght(board, row + 1, 0, num+ 1);
            }
            board[row][col] = '*';
        }

        if (col != n - 1)  nKinght(board, row, col + 1, num);
        else  nKinght(board, row + 1, 0, num);
    }

    public static void main(String args[]) {
        System.out.println("Enter the size of chess board :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '*';
            }
        }

        nKinght(board, 0, 0, 0);
        sc.close();

    }
}