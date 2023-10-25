package Players;

import Defensive.Philtre;
import Offensive.Sort.*;


public class  Magiens extends Personnage {

    public Magiens(String name) {

        this.name = name;
        this.forceDAttaque = 15 ;
        this.niveauDeVie = 6 ;
        this.newOffesif = new Eclair();
        this.newDefensif = new Philtre();

    }

    @Override
    public String toString() {

        return  " ---Magicien---" +'\n'+
                " name= " + name +'\n'+
                " niveauDeVie= " + niveauDeVie +'\n'+
                " forceDAttaque= " + forceDAttaque+'\n'+
                " Offensif= " + newOffesif.getnomAttaque() + '\n' +
                " OffensifNiveau= " + newOffesif.getniveauAttaque() + '\n' +
                " Defensif= " + newDefensif.getnomDefense() + '\n' +
                " DefensifNiveau= " + newDefensif.getniveauDefense()

                ;
    }



}
