package org.example;

public class Board {

    public Board() {

    }

    // Create/Initialize a Tic Tac Toe board
    public static char[][] createBoard(){

        // Create a board of 3x3
        char[][] board = new char[3][3];

        // Initialize board
        // Will start will list '1' - '9' from left to right, top to bottom
        int num = 49;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = (char) num;
                num++;
            }
        }

        return board;
    }

    // Update board going by user selected number and change to player's letter
    public static void updateBoard(char[][] boardUpdate, char playerLetter, int number){

        // Determines which spot was selected and changes that spot
        if (number < 4){
            --number;
            boardUpdate[0][number] = playerLetter;
        }
        else if (number < 7){
            number -= 4;
            boardUpdate[1][number] = playerLetter;
        }
        else {
            number -= 7;
            boardUpdate[2][number] = playerLetter;
        }

    }

    // Determine if there is a winner and get the letter of the winner
    public static char calculateWinner(char[][] boardWin, char playerLetter){
        char winLetter = ' ';

        int letterOccurrence = 0;

        // Check each row for a winner
        // 1st Row
        for(int j = 0; j < 3; j++){
            if(boardWin[0][j] == playerLetter){
                letterOccurrence++;
            }
        }

        // Letter appears 3 times continuously
        if(letterOccurrence == 3){
            return playerLetter;
        }
        else {
            letterOccurrence = 0;
        }

        // 2nd Row
        for(int j = 0; j < 3; j++){
            if(boardWin[1][j] == playerLetter){
                letterOccurrence++;
            }
        }

        // Letter appears 3 times continuously
        if(letterOccurrence == 3){
            return playerLetter;
        }
        else {
            letterOccurrence = 0;
        }

        // 3rd Row
        for(int j = 0; j < 3; j++){
            if(boardWin[2][j] == playerLetter){
                letterOccurrence++;
            }
        }

        // Letter appears 3 times continuously
        if(letterOccurrence == 3){
            return playerLetter;
        }
        else {
            letterOccurrence = 0;
        }

        // Check each column for a winner

        // 1st Column
        for(int i = 0; i < 3; i++){
            if(boardWin[i][0] == playerLetter){
                letterOccurrence++;
            }
        }

        // Letter appears 3 times continuously
        if(letterOccurrence == 3){
            return playerLetter;
        }
        else {
            letterOccurrence = 0;
        }

        // 2nd Column
        for(int i = 0; i < 3; i++){
            if(boardWin[i][1] == playerLetter){
                letterOccurrence++;
            }
        }

        // Letter appears 3 times continuously
        if(letterOccurrence == 3){
            return playerLetter;
        }
        else {
            letterOccurrence = 0;
        }

        // 3rd Column
        for(int i = 0; i < 3; i++){
            if(boardWin[i][2] == playerLetter){
                letterOccurrence++;
            }
        }

        // Letter appears 3 times continuously
        if(letterOccurrence == 3){
            return playerLetter;
        }
        else {
            letterOccurrence = 0;
        }

        // Check each diagonal for a winner

        // Right -> Left, [0][0] [1][1] [2][2]
        for(int i = 0; i < 3; i++){
            if(boardWin[i][i] == playerLetter){
                letterOccurrence++;
            }
        }

        // Letter appears 3 times continuously
        if(letterOccurrence == 3){
            return playerLetter;
        }
        else {
            letterOccurrence = 0;
        }

        // Left -> Right, [0][2] [1][1] [2][0]
        int down = 2;
        for(int i = 0; i < 3; i++){
            if(boardWin[i][down] == playerLetter){
                letterOccurrence++;
            }
            down--;
        }

        // Letter appears 3 times continuously
        if(letterOccurrence == 3){
            return playerLetter;
        }
        else{
            return winLetter;
        }

    }

}
