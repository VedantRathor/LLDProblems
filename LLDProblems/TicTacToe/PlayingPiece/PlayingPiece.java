package com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.PlayingPiece;

import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Piece.Piece;

public abstract class PlayingPiece {
    private final Piece piece;
    public PlayingPiece(Piece piece) {
        this.piece = piece;
    }

    public Character getPlayingPiece() {
        if (this.piece == Piece.X) return 'X';
        if (this.piece == Piece.$) return '$';
        if (this.piece == Piece.O) return 'O';
        return 'Y';
    }
}
