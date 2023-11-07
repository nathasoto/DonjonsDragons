package Game;

import Players.Personnage;

// All methodes are public et abstrac not construtor

/**
 * @author nathalie.soto
 */
public interface ICase { // interconectar colecciones de methodos abstractos, herencia multiple

public String toString();

public  void interaction(Personnage player);



}
