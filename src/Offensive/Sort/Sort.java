package Offensive.Sort;

import Game.Case;
import Offensive.EquipementOffensif;
import Players.Personnage;

public class Sort extends EquipementOffensif {
    public Sort() {

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
