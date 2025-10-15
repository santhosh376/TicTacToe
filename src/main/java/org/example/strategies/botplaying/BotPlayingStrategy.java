package org.example.strategies.botplaying;

import org.example.models.Board;
import org.example.models.Cell;
import org.example.models.Move;

public interface BotPlayingStrategy {

    Cell suggestMove(Board board);


}
