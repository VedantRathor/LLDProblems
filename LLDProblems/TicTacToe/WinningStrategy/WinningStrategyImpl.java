package com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.WinningStrategy;

import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Board.Board;
import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Player.Player;

public abstract class WinningStrategyImpl implements WinningStrategy {
    @Override
    public boolean isDraw(Board board) {
        // your logic.
        return false;
    }

    public abstract boolean checkWinner(Board board, Player player);
}
