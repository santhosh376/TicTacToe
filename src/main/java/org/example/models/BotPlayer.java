package org.example.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.example.strategies.botplaying.BotPlayingStrategy;
import org.example.strategies.botplaying.EasyBotPlayingStrategy;

import javax.swing.plaf.metal.MetalIconFactory;

@Setter
@Getter
@SuperBuilder
public class BotPlayer extends Player{
     private DifficultyLevel difficultyLevel;
     BotPlayingStrategy botPlayingStrategy = new EasyBotPlayingStrategy();

     @Override
     public Cell nextMove(Board board) {
          // TODO: Have a simple factory here based on difficulty level
          // TODO: Don't initialize everytime
         botPlayingStrategy = new EasyBotPlayingStrategy();
         Cell cell = botPlayingStrategy.suggestMove(board);

         Cell boardCell = board.getBoard().get(cell.getRow()).get(cell.getCol());

         boardCell.setPlayer(this);
         boardCell.setCellState(CellState.OCCUPIED);
         return boardCell;
     }
}
