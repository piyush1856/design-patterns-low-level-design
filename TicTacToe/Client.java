package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.RowWinningStrategy;
import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//       GameController should be a single object
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer(1 , PlayerType.HUMAN , "Mohit" , new Symbol('x' , "Green")));
        players.add(new BotPlayer(2 , PlayerType.BOT , "Bot 1" , new Symbol('o' , "Green"), BotDifficultyLevel.EASY));

        List< WinningStrategy > winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        Game game =  gameController.startGame(3 , players , winningStrategies);

        gameController.display(game);

        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
            gameController.makeMove(game);
            gameController.display(game);

            System.out.println("Do you want to Undo [Y/N]");
            String undoResponse = scanner.nextLine();
            if(undoResponse.equals("Y")){
                gameController.undo(game);
                System.out.println("Undo is successful");
                gameController.display(game);
            }
        }

        if(gameController.checkState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner is " + gameController.getWinner(game).getName());
        } else if (gameController.checkState(game).equals(GameState.DRAW)){
            System.out.println("Game ends in a DRAW !");
        }
    }
}





// 1. Code the Models
// 2. Create a client and what all interactions he might be doing
// 3. Create the controller
