package com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Player;

import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.PlayingPiece.PlayingPiece;

public class Player {
    private Integer id;
    private String name;
    private PlayingPiece playingPiece;

    public Player(Integer id, String name, PlayingPiece playingPiece) {
        this.id = id;
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }
}
