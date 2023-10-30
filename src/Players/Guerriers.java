package Players;

import Defensive.Bouclier;
import Offensive.Arme.*;
import java.lang.String;

public class Guerriers extends Personnage {

    public Guerriers(String name) {

        this.name = name;
        this.type = "Guerrier";
        this.niveauDeVie = 10;
        this.forceDAttaque = 10;
        this.offensif = new Massue();
        this.defensif = new Bouclier();

    }

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

