package Players;

import Defensive.Philtre;
import Offensive.Sort.*;


public class  Magiens extends Personnage {

    public Magiens(String name) {

        this.name = name;
        this.forceDAttaque = 15 ;
        this.niveauDeVie = 6 ;
        this.offensif = new Eclair();
        this.defensif = new Philtre();

    }

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
