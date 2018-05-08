package com.company;

import java.util.Arrays;

public class MainGame {

    private char[][] board;
    private char currentPlayer = 'x';



    //encapsulation for currentPlayer
    public char getCurrentPlayer(){
        return currentPlayer;
    }

    //responsible for ensuring that the board gets initialized properly. It will also decide which player would be playing first.
    public MainGame(){

    }

    //When this method is invoked, it will make sure that all the slots on the board are empty.
    public void initializeBoard() {

        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                board[i][j] = '-';
            }

        }

    }

    //The Tic Tac Toe board will be printed in the standard format when this method is initialized.
    public void printBoard(){
        System.out.println("— — — — — — -");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println(" — — — — — — -");
        }
    }

    //check whether the board is full or not. If the board is full, this method would return true, if not false.
    public boolean isBoardFull(){

        for (char[] i : board){
            for (char x : i){
                if (x == '-'){
                    return false;
                }
            }
        }
        return true;
    }



    //If a player wins a game, this method would return true.
    public boolean isWinner(){
        return (checkRows() || checkColumns() || checkDiagonals());
    }


    //This method would check the rows for win
    private boolean checkRows(){
        for (int i = 0; i < 3; i++)
        {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true)
            {
                return true;
            }
        }
        return false;
    }


    //This method will check the columns for the win.
    private boolean checkColumns(){
        for (int i = 0; i < 3; i++)
        {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true)
            {
                return true;
            }
        }
        return false;
    }


    //This method will check the diagonals for the win
    private boolean checkDiagonals() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) ||
                (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));

    }

    //This method will check if the 3 specified characters in the rows
    // and columns contain a similar letter i.e. ‘x’ or ‘o’. If yes, it will return true.
    private boolean checkRowCol(char c1, char c2, char c3){
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    public void changePlayer() {

        if (currentPlayer == 'x')
        {
            currentPlayer = 'o';
        }
else
        {
            currentPlayer = 'x';
        }
    }


    public boolean placeMark(int row, int col) {
        if ((row >= 0) && (col <= 3)) {
            if (board[row][col] == '-') {
                board[row][col] = currentPlayer;
                return true;
            }
        }
        return false;
    }







}
