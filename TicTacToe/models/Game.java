package TicTacToe.models;

import TicTacToe.exceptions.InvalidMoveException;
import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Player winner;
    private int nextPlayerIndex;
    private List<Move> moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    private Game(Builder builder){
        this.board = new Board(builder.dimension);
        this.players = builder.players;
        this.winningStrategies = builder.winningStrategies;
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void display(){
        board.displayBoard();
    }

    public boolean validateMove(Move move){
        int r = move.getCell().getRow();
        int c = move.getCell().getCol();

        if(r  < 0 || c < 0 || r > board.getGrid().size() - 1 || c > board.getGrid().size() - 1){
            return false;
        }
        return !board.getGrid().get(r).get(c).getCellState().equals(CellState.FILLED);
    }

    public boolean checkWinner(Move move){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board, move)){
                return true;
            }
        }
        return false;
    }

    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerIndex);

        System.out.println("It's " + currentPlayer.getName() + "'s turn. Please make your move");
        Move move = currentPlayer.makeMove(board);

        // validate the move
        if(!validateMove(move)){
            throw new InvalidMoveException("Invalid Move, Please try again!");
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cell = board.getGrid().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setSymbol(currentPlayer.getSymbol());

        nextPlayerIndex += 1;
        nextPlayerIndex %= players.size();

        move.setCell(cell);
        moves.add(move);

//        update the state of the game by checking if winner is there or not
        if(checkWinner(move)){
            setWinner(currentPlayer);
            setGameState(GameState.SUCCESS);
        } else if (moves.size() == board.getSize() * board.getSize()){
            setWinner(null);
            setGameState(GameState.DRAW);
        }

    }

    public void undo(){
        if(moves.isEmpty()){
            System.out.println("No moves present. Can't Undo");
            return;
        }

        Move lastMove = moves.get(moves.size() - 1);
        moves.remove(moves.size() - 1);

        Cell cell = lastMove.getCell();
        cell.setCellState(CellState.EMPTY);
        cell.setSymbol(null);

        nextPlayerIndex = (nextPlayerIndex - 1 + players.size()) % players.size();
//        (a - b) % n = (a - b + n) % n

        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.handleUndo(board, lastMove);
        }

        setWinner(null);
        setGameState(GameState.IN_PROGRESS);

    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder addPlayer(Player player){
            this.players.add(player);
            return this;
        }

        public void validate(){
//            1. At max 1 Bot in the game

//            2. Players size = dimension - 1
            if(players.size() != dimension - 1){
                throw new RuntimeException("Invalid players count");
            }
//            3. Every player should have separate symbol

        }

        public Game build(){
            validate();
            return new Game(this);
        }
    }


}
