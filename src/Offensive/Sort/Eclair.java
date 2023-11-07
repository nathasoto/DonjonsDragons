package Offensive.Sort;

import Offensive.EquipementOffensif;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public class Eclair extends EquipementOffensif {
    public Eclair() {
        nomAttaque = "Eclair";
        niveauAttaque= 2;
    }

    @Override
    protected void setNewOffensive(Personnage player) {
        player.setOffensif(new Eclair());
    }


}
