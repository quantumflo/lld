package com.quantumflo.lld.tictactoe.strategy;

import com.quantumflo.lld.tictactoe.models.Board;

public class RowWinningStrategy implements WinningStrategy {
    public boolean checkVictory(Board board ) {
        System.out.println("row");
        return true;
    }
}
