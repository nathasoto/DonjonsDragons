package Offensive.Sort;

import Offensive.EquipementOffensif;
import Players.Personnage;

public class Sort extends EquipementOffensif {
    public Sort() {
        TypeOffensive = "Sort";
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
