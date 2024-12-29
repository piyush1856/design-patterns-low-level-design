package TicTacToe.models;

import TicTacToe.strategies.BotPlayingStategy;
import TicTacToe.strategies.BotPlayingStrategyFactory;

public class BotPlayer extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStategy botPlayingStategy;

    public BotPlayer(int id, PlayerType playerType , String name, Symbol symbol , BotDifficultyLevel botDifficultyLevel) {
        super(id , playerType , name , symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        return botPlayingStategy.makeMove(board, this);
    }
}
