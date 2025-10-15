package org.example.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Scanner;

@Getter
@Setter
@SuperBuilder
public class HumanPlayer extends Player {
    private int rank;
    private int age;

    @Override
    public Cell nextMove(Board board) {
        //1. Check if there is empty cell in the board
        //2. Taking input from the user, which row and col they want to place
        //3. The cell should be empty
        //4. Place the symbol in the allocated cell. update  the state of the board

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the row:");
        int row = sc.nextInt();
        System.out.println("Please enter the column:");
        int col = sc.nextInt();

        // TODO add a custom exception
        if(!board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)){
            throw new IllegalArgumentException("Cells not empty");
        }

        Cell cell = board.getBoard().get(row).get(col);
        cell.setPlayer(this);
        cell.setCellState(CellState.OCCUPIED);
        return cell;
    }
}
