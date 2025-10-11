package org.example.controller;

import org.example.models.Game;
import org.example.models.GameState;
import org.example.models.Player;
import org.example.strategies.winning.WinningStrategy;

import java.util.List;

public class GameController {

    Game game;

    public GameController(Game game) {
        this.game = game;
    }

    public static Game initiateGame(int dimension, List<Player> players, List<WinningStrategy>winningStrategies){
        return new Game(dimension,players,winningStrategies);
    }

    public void startGame(){
        game.setGameState(GameState.INIT);
    }
}
