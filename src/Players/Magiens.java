package Players;

import Defensive.Bouclier;
import Defensive.Philtre;
import Offensive.Arme.Epee;
import Offensive.Arme.Massue;
import Offensive.Sort.*;

public class  Magiens extends Personnage {

    public Magiens(String name) {

        super(name,10,10, new Massue(),new Bouclier(),10,5,"Magicien");

    }
    public Magiens(){
        this("maximo"); //call the first contructorjust for example
    }

}
