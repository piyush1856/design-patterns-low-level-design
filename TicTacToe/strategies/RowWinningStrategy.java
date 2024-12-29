package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{
    HashMap<Integer, HashMap<Character , Integer> > rowCount = new HashMap<>();
    @Override
    public boolean checkWinner(Board board , Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getCell().getSymbol();

        if(!rowCount.containsKey(row)){
            rowCount.put(row, new HashMap<>());
        }

        HashMap<Character , Integer> counts = rowCount.get(row);

        if(!counts.containsKey(symbol.getCharSymbol())){
            counts.put(symbol.getCharSymbol(), 0);
        }
//        increase it frequency
        counts.put(symbol.getCharSymbol(), counts.get(symbol.getCharSymbol()) + 1);

        if(counts.get(symbol.getCharSymbol()) == board.getSize()){
            return true;
        }
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        rowCount.get(row).put(symbol.getCharSymbol(), rowCount.get(row).get(symbol.getCharSymbol()) - 1);
    }
}
// For every row, for every symbol : store the count

// 0 : 'x' -> 1
// 0 : 'o' -> 1

// 1 : 'x' -> 1
// 1 : 'o' -> 0

// 2 : 'x' -> 0
// 2 : 'o' -> 1


