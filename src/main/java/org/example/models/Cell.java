package org.example.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cell {
    private int row,col;
    private CellState cellState;
    Player player;

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + row +
                ", col=" + col +
                ", cellState=" + cellState +
                ", player=" + player +
                '}';
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;


    }
}
