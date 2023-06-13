package org.example.factories;

import org.example.models.BotDifficultyLevel;
import org.example.strategies.botPlayingStrategy.BotPlayingStrategy;
import org.example.strategies.botPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        return new RandomBotPlayingStrategy();
    }
}
