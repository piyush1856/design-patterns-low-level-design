package TicTacToe.models;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);
    public HumanPlayer(int id, PlayerType playerType , String name, Symbol symbol) {
        super(id, playerType, name, symbol);
    }

    public Move makeMove(Board board) {
        System.out.println("Please enter the row in which you want to place the symbol");
        int r = scanner.nextInt();
        System.out.println("Please enter the column in which you want to place the symbol");
        int c = scanner.nextInt();

        return new Move(new Cell(r , c) , this);
    }
}
