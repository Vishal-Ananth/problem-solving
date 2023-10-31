package src;

import java.util.Arrays;

public class FindWinnerOnATicTacToeGame {
    public static void main(String[] args) {
        int[][] moves = {{0, 0},{2, 0},{1, 1},{2, 1},{2, 2}};
        char[][] board = new char[3][3];
        for(char[] r:board){
            Arrays.fill(r,'.');
        }
        int p=1;

        for(int r=0;r< moves.length;r++){
            if(p%2==0){
                board[moves[r][0]][moves[r][1]]='A';
            }else{
                board[moves[r][0]][moves[r][1]]='B';
            }
            p++;
        }

        for(char[] r:board){
            for(char c:r){
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
