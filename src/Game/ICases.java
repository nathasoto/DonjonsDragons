package Game;

import Players.Personnage;

// All methodes are public et abstrac not construtor

public interface ICases { // interconectar colecciones de methodos abstractos, herencia multiple

    public String toString();

    public void interaction(Personnage player);


}