package com.quantumflo.lld.tictactoe.strategy;

import com.quantumflo.lld.tictactoe.models.Board;
import com.quantumflo.lld.tictactoe.models.Move;

public interface PlayingStrategy {
    Move makeMove(Board board);
}
