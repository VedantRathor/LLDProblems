package com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Board.Cell;

import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Player.Player;

public class Cell {
    private Player player;

    public Cell() {
        this.player = null;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isEmpty() {
        return (this.player == null);
    }
}
