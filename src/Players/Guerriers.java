package Players;

import Defensive.Bouclier;
import Offensive.Arme.*;
import java.lang.String;
/**
 * <h1>Define a Personnage type Guerriers </h1>
 *
 * @author nathalie.soto <a href="https://github.com/nathasoto/DonjonsDragons"> GitHub </a>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Guerriers extends Personnage {
    /**
     * Constructor for the Guerriers class
     * @param name String  the personnage's name
     */
    public Guerriers(String name) {

        this.name = name;
        this.type = "Guerrier";
        this.niveauDeVie = 10;
        this.forceDAttaque = 10;
        this.offensif = new Massue();
        this.defensif = new Bouclier();

    }

    /**
     *
     * @return  character string  used to describe the object guerriers.
     */
    @Override
    public String toString() {

        return " ---Guerrier---" + '\n' +
                " name= " + name + '\n' +
                " niveauDeVie= " + niveauDeVie + '\n' +
                " forceDAttaque= " + forceDAttaque + '\n' +
                " Offensif= " + offensif.getnomAttaque() + '\n' +
                " OffensifNiveau= " + offensif.getniveauAttaque() + '\n' +
                " Defensif= " + defensif.getnomDefense() + '\n' +
                " DefensifNiveau= " + defensif.getniveauDefense()
                ;
    }


}

