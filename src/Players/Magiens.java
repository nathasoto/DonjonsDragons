package Players;

import Defensive.Philtre;
import Offensive.Sort.*;

/**
 * <h1>Define a Personnage type Magiens  </h1>
 *
 * @author nathalie.soto <a href="https://github.com/nathasoto/DonjonsDragons"> GitHub </a>
 * @version 1.0.0
 * @since 1.0.0
 */
public class  Magiens extends Personnage {
    /**
     * Constructor for the Magiens class
     * @param name String  the personnage's name
     */
    public Magiens(String name) {

        this.name = name;
        this.type= "Magicien";
        this.forceDAttaque = 15 ;
        this.niveauDeVie = 6 ;
        this.offensif = new Eclair();
        this.defensif = new Philtre();

    }

    /**
     *
     * @return character string used to describe the object magiciens.
     */

    @Override
    public String toString() {

        return  " ---Magicien---" +'\n'+
                " name= " + name +'\n'+
                " niveauDeVie= " + niveauDeVie +'\n'+
                " forceDAttaque= " + forceDAttaque+'\n'+
                " Offensif= " + offensif.getnomAttaque() + '\n' +
                " OffensifNiveau= " + offensif.getniveauAttaque() + '\n' +
                " Defensif= " + defensif.getnomDefense() + '\n' +
                " DefensifNiveau= " + defensif.getniveauDefense()

                ;
    }


}
