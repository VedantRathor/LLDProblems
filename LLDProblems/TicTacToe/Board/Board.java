package com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Board;

import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Board.Cell.Cell;
import com.cloudvendor.cloudvendor.LLDProblems.TicTacToe.Move;

public class Board {
    private Integer size;
    private Cell[][] board;

    public Board(Integer size) {
        this.size = size;
        this.board = new Cell[this.size][this.size];

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.board[i][j] = new Cell();
            }
        }
    }

    public Integer getSize() {
        return this.size;
    }

    public Cell[][] getBoard() {
        return this.board;
    }

    public void displayBoard() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (this.board[i][j].isEmpty()) {
                    System.out.print("_ |");
                }
            }
            System.out.println();
        }
        return;
    }

    public boolean setPlayer(Move move) {
        if (!canPlayerBeSet(move)) return false;

        Integer x = move.getX();
        Integer y = move.getY();
        this.board[x][y].setPlayer(move.getPlayer());

        return true;
    }

    private boolean canPlayerBeSet(Move move) {
        Integer x = move.getX();
        Integer y = move.getY();

        return (x >= 0 && x < this.size && y >= 0 && y < this.size && this.board[x][y].isEmpty());
    }
}
