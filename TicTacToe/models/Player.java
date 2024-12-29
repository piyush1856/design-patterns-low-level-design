package TicTacToe.models;

public abstract class Player {
    private int id;
    private PlayerType playerType;
    private String name;
    private Symbol symbol;

    public Player(int id, PlayerType playerType, String name, Symbol symbol) {
        this.id = id;
        this.playerType = playerType;
        this.name = name;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract Move makeMove(Board board);
}
