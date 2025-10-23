package org.example.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.exceptions.InvalidCellException;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor



public abstract class Player {
    private String name;
    private Integer id;
    private char symbol;
    private PlayerType playerType;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", symbol=" + symbol +
                ", playerType=" + playerType +
                '}';
    }

    public abstract Cell nextMove(Board board) throws InvalidCellException;

}
