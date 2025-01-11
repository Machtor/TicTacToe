package org.example;

public class Player {

    String playerName;
    char letter;
    boolean playerTurn;

    // Create a Player with a Name, Turn Value, and Letter of choice for Tic Tac Toe
    public Player(String name, char choice, boolean turn) {
        // Player chooses name
        playerName = name;

        // Player chooses 'X' or 'O'
        letter = choice;

        // Player turn
        playerTurn = turn;
    }

    // Change a player's turn
    public boolean setTurn(boolean newTurn){
        this.playerTurn = newTurn;
        return playerTurn;
    }
}
