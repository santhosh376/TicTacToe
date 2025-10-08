package org.example.strategies;

import org.example.models.Board;
import org.example.models.Cell;

public interface WinningStrategy {
    boolean checkWin(Cell cell, Board board);
}
