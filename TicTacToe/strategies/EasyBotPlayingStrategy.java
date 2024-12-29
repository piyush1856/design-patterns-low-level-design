package TicTacToe.strategies;

import TicTacToe.models.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStategy{
    @Override
    public Move makeMove(Board board , Player player) {
//      put the symbol in the first empty place
//        int dimension = board.getSize();
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
//                    cell.setCellState(CellState.FILLED);
//                    cell.setSymbol(player.getSymbol());
                    return new Move(cell, player);
                }
            }
        }
        return null;
    }
}
