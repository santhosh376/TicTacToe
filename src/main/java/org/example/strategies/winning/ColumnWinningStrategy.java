package org.example.strategies.winning;

import org.example.models.Board;
import org.example.models.Cell;
import org.example.models.CellState;
import org.example.models.Player;

public class ColumnWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWin(Cell cell, Board board) {
        Player currentPlayer = cell.getPlayer();

        int col = cell.getCol();

        for (int i = 0; i < board.getSize(); i++){
            Cell currentCell = board.getBoard().get(i).get(col);
            if(currentCell.getCellState().equals(CellState.EMPTY) ||
                    !currentCell.getPlayer().equals(currentPlayer)){
                return  false;

            }
        }
        return true;
    }
}


