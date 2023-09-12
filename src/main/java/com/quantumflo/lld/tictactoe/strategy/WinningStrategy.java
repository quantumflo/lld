package com.quantumflo.lld.tictactoe.strategy;

import com.quantumflo.lld.tictactoe.models.Board;

public interface WinningStrategy {
    public boolean checkVictory(Board board);
}
