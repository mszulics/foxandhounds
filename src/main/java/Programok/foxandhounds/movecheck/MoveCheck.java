package Programok.foxandhounds.movecheck;


public class MoveCheck {
    public boolean moveCheck(int[][] board,int inputRow, int inputCol){
        return board[inputRow][inputCol] == 0;
    }

    public boolean botMoveCheck(int[][] board, int inputRow, int inputCol){
        boolean validMove = false;

        if((inputRow != -1) && (inputCol != -1) && (inputCol != 8)){
            if (board[inputRow][inputCol]==0) validMove = true;
        }

        return validMove;
    }
}
