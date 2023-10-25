package Offensive.Arme;
import Offensive.EquipementOffensif;
import Players.Guerriers;
import Players.Personnage;

public class Arme extends EquipementOffensif {

    public Arme() {

    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public int getniveauAttaque() {
        return this.niveauAttaque;
    }

    @Override
    public String getnomAttaque() {
        return this.nomAttaque;
    }

    @Override
    public void interaction(Personnage player) {


    }
}
