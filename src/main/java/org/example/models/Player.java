package org.example.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

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

    public abstract Cell nextMove(Board board);
}
