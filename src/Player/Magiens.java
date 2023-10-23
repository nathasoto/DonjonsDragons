package Player;

import Defensive.Philtre;
import Offensive.Sort;


public class  Magiens extends Personnage {

    public Magiens(String name) {

        this.name = name;
        this.type ="Magicien";
        this.niveauDeVie = 6 ;
        this.forceDAttaque = 15 ;
        this.newOffesif = new Sort();
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

    @Override
    public void setName(String name) {
        this.name =name;
    }

    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
