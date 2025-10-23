package org.example.strategies.winning;

import org.example.models.Board;
import org.example.models.Cell;
import org.example.models.CellState;
import org.example.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ColumnWinningStrategy implements WinningStrategy{


    private final HashMap<Player, HashMap<Integer, Integer> > counts = new HashMap<>();

    @Override
    public boolean checkWin(Cell cell, Board board) {
        Player currentPlayer = cell.getPlayer();

        int col = cell.getCol();

//        for (int i = 0; i < board.getSize(); i++) {
//            Cell currentCell = board.getBoard().get(i).get(col);
//            if (currentCell.getCellState().equals(CellState.EMPTY) ||
//                    !currentCell.getPlayer().equals(currentPlayer)) {
//                return false;
//            }
//        }

        if (!counts.containsKey(currentPlayer)) {
            counts.put(currentPlayer, new HashMap<>());
        }
        if (!counts.get(currentPlayer).containsKey(col)) {
            counts.get(currentPlayer).put(col, 0);
        }
        int cnt = counts.get(currentPlayer).get(col);

        counts.get(currentPlayer).put(col, cnt + 1);

        return cnt + 1 == board.getSize();

//        return true;

    }
}


