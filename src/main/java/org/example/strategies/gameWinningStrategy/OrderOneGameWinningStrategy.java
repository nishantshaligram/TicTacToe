package org.example.strategies.gameWinningStrategy;

import org.example.models.Board;
import org.example.models.Cell;
import org.example.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    private int boardDimensions;
    private List<HashMap<Character, Integer>> rowSymbolCounts;
    private List<HashMap<Character, Integer>> colSymbolCounts;
    private HashMap<Character, Integer> leftDiagonalSymbolCounts;
    private HashMap<Character, Integer> rightDiagonalSymbolCounts;
    public OrderOneGameWinningStrategy(int boardDimensions) {
        this.boardDimensions = boardDimensions;
        this.rowSymbolCounts = new ArrayList<>();
        this.colSymbolCounts = new ArrayList<>();
        this.leftDiagonalSymbolCounts = new HashMap<>();
        this.rightDiagonalSymbolCounts = new HashMap<>();

        // create maps for each rows & cols
        for(int i=0; i < this.boardDimensions; i++){
            rowSymbolCounts.add(new HashMap<>());
            colSymbolCounts.add(new HashMap<>());
        }
    }

    public boolean isCellOnLeftDiagonal(int x, int y){
        return x == y;
    }

    public boolean isCellOnRightDiagonal(int x, int y, int dimension){
        return (x+y) == dimension-1;
    }
    @Override
    public boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell) {
        //TODO: implement this
        char symbol = lastPlayedPlayer.getSymbol();
        int row = lastPlayedMoveCell.getRow();
        int col = lastPlayedMoveCell.getCol();
        int dimension = board.getBoard().size();

        // update symbol count on row
        if(!this.rowSymbolCounts.get(row).containsKey(symbol)){
            this.rowSymbolCounts.get(row).put(symbol, 0);
        }
        this.rowSymbolCounts
            .get(row)
            .put(
                symbol,
                rowSymbolCounts.get(row).get(symbol)+1
            );
        // update symbol count on column
        if(!this.colSymbolCounts.get(col).containsKey(symbol)){
            this.colSymbolCounts.get(col).put(symbol, 0);
        }
        this.colSymbolCounts
            .get(col)
            .put(
                symbol,
                this.colSymbolCounts.get(col).get(symbol)+1
            );
        // update symbol count on left diagonal
        if(this.isCellOnLeftDiagonal(row, col)){
            if(!this.leftDiagonalSymbolCounts.containsKey(symbol)){
                this.leftDiagonalSymbolCounts.put(symbol, 0);
            }
            this.leftDiagonalSymbolCounts.put(
                symbol,
                this.leftDiagonalSymbolCounts.get(symbol)+1
            );
        }
        // update symbol count on right diagonal
        if(this.isCellOnRightDiagonal(row, col, dimension)){
            if(!this.rightDiagonalSymbolCounts.containsKey(symbol)){
                this.rightDiagonalSymbolCounts.put(symbol, 0);
            }
            this.rightDiagonalSymbolCounts.put(
                symbol,
                this.rightDiagonalSymbolCounts.get(symbol)+1
            );
        }
        // check if symbol count on row or cols is equal to dimension
        if(rowSymbolCounts.get(row).get(symbol) == dimension
                || colSymbolCounts.get(col).get(symbol) == dimension){
            return true;
        }
        // check if symbol count on left diagonal is equal to dimension
        if(this.isCellOnLeftDiagonal(row, col)
                && leftDiagonalSymbolCounts.get(symbol) == dimension)
            return true;
        // check if symbol count on right diagonal is equal to dimension
        if(this.isCellOnRightDiagonal(row, col, dimension)
                && rightDiagonalSymbolCounts.get(symbol) == dimension)
            return true;

        return false;
    }
}
