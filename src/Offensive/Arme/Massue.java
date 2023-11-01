package Offensive.Arme;

import Offensive.EquipementOffensif;
import Players.Guerriers;
import Players.Personnage;

public class Massue extends EquipementOffensif {
    public Massue() {
        nomAttaque = "Massue";
        niveauAttaque = 3;
    }

    @Override
    protected void setNewOffensive(Personnage player) {
        player.setOffensif(new Massue());
    }
}
