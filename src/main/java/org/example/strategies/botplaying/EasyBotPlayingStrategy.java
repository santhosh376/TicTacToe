package org.example.strategies.botplaying;

import org.example.models.Board;
import org.example.models.Cell;
import org.example.models.CellState;
import org.example.models.Move;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Cell suggestMove(Board board) {
        int n = board.getSize();
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                if(board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    return  new Cell(i, j);
                }
            }
        }
        return null;
    }

}
