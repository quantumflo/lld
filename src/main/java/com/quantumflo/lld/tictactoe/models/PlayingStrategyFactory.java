package com.quantumflo.lld.tictactoe.models;

import com.quantumflo.lld.tictactoe.enums.DifficultyLevel;
import com.quantumflo.lld.tictactoe.strategy.EasyPlayingStrategy;
import com.quantumflo.lld.tictactoe.strategy.PlayingStrategy;

public class PlayingStrategyFactory {
    public static PlayingStrategy getPlayingStrategy(DifficultyLevel level ) {
        if(level == DifficultyLevel.EASY) {
            return new EasyPlayingStrategy();
        }

        return null;
    }
}
