package com.quantumflo.lld.tictactoe.models;

import com.quantumflo.lld.tictactoe.enums.DifficultyLevel;
import com.quantumflo.lld.tictactoe.strategy.PlayingStrategy;

public class Bot extends Player{
    private DifficultyLevel difficultyLevel;
    private PlayingStrategy playingStrategy;

    public Bot(DifficultyLevel level ) {
        playingStrategy = PlayingStrategyFactory.getPlayingStrategy(level);
    }

    public Move makeMove(Board board) {

        return playingStrategy.makeMove(board);
    }

}
