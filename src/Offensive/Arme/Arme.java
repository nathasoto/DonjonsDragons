package Offensive.Arme;
import Offensive.EquipementOffensif;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public abstract class Arme extends EquipementOffensif {

    public Arme() {
        typeOffensive = "Arme";
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


}
