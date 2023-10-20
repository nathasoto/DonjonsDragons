package Player;

import Defensive.Philtre;
import Offensive.Sort;
import Player.Personnage;

public class  Magiens extends Personnage {

    Sort newSort = new Sort();
    Philtre newPhiltre = new Philtre();
    public Magiens(String name) {

        this.name = name;
        this.type ="Magicien";
        this.niveauDeVie = 6 ;
        this.forceDAttaque = 15 ;
        this.equipeOffensif = newSort.getnomAttaque();
        this.niveauAttaque = newSort.getniveauAttaque();
        this.equipeDefensif = newPhiltre.getnomDefense();
        this.niveauDefense=  newPhiltre.getniveauDefense();

    }

    @Override
    public String toString() {

        return  " ---Magicien---" +'\n'+
                " name= " + name +'\n'+
                " niveauDeVie= " + niveauDeVie +'\n'+
                " forceDAttaque= " + forceDAttaque+'\n'+
                " equipeOffensif= " + equipeOffensif+'\n'+
                " niveauAttaque= " + niveauAttaque+'\n'+
                " equipeDefensif= " + equipeDefensif+'\n'+
                " niveauDefense= " + niveauDefense
                ;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
