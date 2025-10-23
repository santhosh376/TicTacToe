package org.example.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Move {
    private Cell cell;
    private Player player;

    @Override
    public String toString() {
        return "Move{" +
                "cell=" + cell +
                ", player=" + player +
                '}';
    }

    public Move(Cell cell, Player player) {
        this.cell = cell;
        this.player = player;
    }
}

