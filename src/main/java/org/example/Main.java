package org.example;

import org.example.models.Game;
import org.example.models.HumanPlayer;
import org.example.models.Player;
import org.example.models.PlayerType;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Player player = new HumanPlayer();
        player.setPlayerType(PlayerType.HUMAN);

        Game game = new Game(3, List.of(player), List.of());

        game.board.print();
    }
}