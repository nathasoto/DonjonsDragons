
import Game.BoardGame;
import Game.GameController;
import Game.MenuView;
import java.util.Scanner;

/**
 * <h1>The Donjons Dragons program implements a board game</h1>
 */
public class Main {

    public static void main(String[] args) {

        GameController gc = new GameController(new MenuView(new Scanner(System.in)), new BoardGame());

        gc.starGame();

    }

}
