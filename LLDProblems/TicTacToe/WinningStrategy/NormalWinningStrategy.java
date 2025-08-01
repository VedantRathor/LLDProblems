package com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.WinningStrategy;

import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Board.Board;
import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Player.Player;

public class NormalWinningStrategy extends WinningStrategyImpl {
    @Override
    public boolean checkWinner(Board board, Player player) {
        return false;
    }
}
