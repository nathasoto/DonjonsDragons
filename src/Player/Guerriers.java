package Player;

import Defensive.Bouclier;
import Offensive.Arme;
import java.util.ArrayList;

public class Guerriers extends Personnage {

    Arme newArme = new Arme();
    Bouclier newBoucle = new Bouclier();
    public Guerriers(String name) {

        this.name = name;
        this.type = "Guerrier";
        this.niveauDeVie =10;
        this.forceDAttaque = 10;
        this.equipeOffensif = newArme.getnomAttaque();
        this.niveauAttaque = newArme.getniveauAttaque();
        this.equipeDefensif =newBoucle.getnomDefense();
        this.niveauDefense= newBoucle.getniveauDefense();

    }
    @Override
    public String toString() {

        return  " ---Guerrier---" +'\n'+
                " name= " + name +'\n'+
                " niveauDeVie= " + niveauDeVie +'\n'+
                " forceDAttaque= " + forceDAttaque+'\n'+
                " equipeOffensif= " + equipeOffensif+'\n'+
                " niveauAttaque= " + niveauAttaque+'\n'+
                " equipeDefensif= " + equipeDefensif+'\n'+
                " niveauDefense= " + niveauDefense
                ;
    }
    public String getType() {
        return this.type;
    }
}
