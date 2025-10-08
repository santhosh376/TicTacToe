package org.example.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private String name;
    private Integer id;
    private char symbol;
    private PlayerType playerType;
}
