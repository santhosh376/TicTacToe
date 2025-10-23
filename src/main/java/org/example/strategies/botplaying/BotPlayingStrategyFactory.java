package org.example.strategies.botplaying;

import org.example.models.DifficultyLevel;

public class BotPlayingStrategyFactory {

    private static final EasyBotPlayingStrategy easyStrategy = new EasyBotPlayingStrategy();
    private static final MediumBotPlayingStrategy mediumStrategy = new MediumBotPlayingStrategy();
    private static final HardBotPlayingStrategy hardStrategy = new HardBotPlayingStrategy();

    public static BotPlayingStrategy getBotPlayingStrategy(DifficultyLevel difficultyLevel) {
        switch (difficultyLevel) {
            case EASY -> {
                return easyStrategy;
            }

            case MEDIUM -> {
                return mediumStrategy;
            }

            case HARD -> {
                return hardStrategy;
            }

        }
        return null;
    }

    private BotPlayingStrategyFactory(){}
}
