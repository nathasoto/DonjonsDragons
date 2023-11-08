package Players;

import Defensive.Bouclier;
import Offensive.Arme.*;
import java.lang.String;

public class Guerriers extends Personnage {

    public Guerriers(String name) {

        super(name,10,10, new Massue(),new Bouclier(),10,5,"Guerrier");

    }


}

