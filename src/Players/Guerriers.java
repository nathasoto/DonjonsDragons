package Players;

import Defensive.Bouclier;
import Offensive.Arme.Arme;

public class Guerriers extends Personnage {

    public Guerriers(String name) {

        this.name = name;
        this.type = "Guerrier";
        this.niveauDeVie = 10;
        this.forceDAttaque = 10;
        this.newOffesif = new Arme();
        this.newDefensif = new Bouclier();

    }

    @Override
    public String toString() {

        return " ---Guerrier---" + '\n' +
                " name= " + name + '\n' +
                " niveauDeVie= " + niveauDeVie + '\n' +
                " forceDAttaque= " + forceDAttaque + '\n' +
                " Offensif= " + newOffesif.getnomAttaque() + '\n' +
                " OffensifNiveau= " + newOffesif.getniveauAttaque() + '\n' +
                " Defensif= " + newDefensif.getnomDefense() + '\n' +
                " DefensifNiveau= " + newDefensif.getniveauDefense()
                ;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getType() {
        return super.getType();
    }
}

