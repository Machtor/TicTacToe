package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create board by using the Board Class Method createBoard()
        char[][] board = Board.createBoard();

        // Display the board
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        Scanner userChoice = new Scanner(System.in);

        // TODO: Allow players to choose their own name
        // TODO: Random assignment of letter between X and O
        Player p1 = new Player("L", 'X', true);
        Player p2 = new Player("D", 'O', false);

        char winner = ' ';

        boolean noWinner = true;
        while(noWinner){

            // Player Choices -> Board Update
            // TODO: Create a Display/View class
            if(p1.playerTurn){
                System.out.println(p1.playerName + " turn with letter " + p1.letter);
                System.out.print("Type in number choice for spot on the board: ");
                int numChoice = userChoice.nextInt();
                Board.updateBoard(board, p1.letter, numChoice);
            }
            else {
                System.out.println(p2.playerName + " turn with letter " + p2.letter);
                System.out.print("Type in number choice for spot on the board: ");
                int numChoice = userChoice.nextInt();
                Board.updateBoard(board, p2.letter, numChoice);
            }

            // Change turn
            p1.setTurn(!p1.playerTurn);
            p2.setTurn(!p2.playerTurn);

            // If there is a winner
            // TODO: Add to Display/View class
            winner = Board.calculateWinner(board, p1.letter);
            if(winner != ' '){
                noWinner = false;
                System.out.println("Winner is " + winner);
            }

            winner = Board.calculateWinner(board, p2.letter);
            if(winner != ' '){
                noWinner = false;
                System.out.println("Winner is " + winner);
            }

            // Display updated board
            // TODO: Add to Display/View class
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[i].length; j++){
                    System.out.print(board[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }

            // TODO: Add count up to 9 (max turns) to end while loop = Board is full and no winner

        }

    }
}