package org.example.strategies.winning;

import org.example.models.Board;
import org.example.models.Cell;


// TODO : Implement diagonal winning strategy
public interface WinningStrategy {
    boolean checkWin(Cell cell, Board board);
}
