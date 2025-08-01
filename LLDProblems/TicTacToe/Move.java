package com.cloudvendor.cloudvendor.LLDProblems.TicTacToe;

import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Player.Player;

public class Move {
    private Integer x;
    private Integer y;
    private Player player;

    public Move(Integer x, Integer y, Player player) {
        this.x = x;
        this.y = y;
        this.player = player;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Player getPlayer() {
        return player;
    }
}
