package Game;

public class ExceptionOutOfBounds extends Exception {
    public ExceptionOutOfBounds() {
        super("on est en dehors du plateau");
    }
}
