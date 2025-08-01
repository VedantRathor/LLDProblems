package com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.WinningStrategy;

import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Board.Board;
import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Player.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player);
    boolean isDraw(Board board);
}
