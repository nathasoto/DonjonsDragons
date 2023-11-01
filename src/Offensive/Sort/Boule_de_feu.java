package Offensive.Sort;

import Offensive.Arme.Massue;
import Offensive.EquipementOffensif;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public class Boule_de_feu extends EquipementOffensif {
    public Boule_de_feu() {
        nomAttaque = "Boule de feu";
        niveauAttaque = 7;
    }

    @Override
    protected void setNewOffensive(Personnage player) {
        player.setOffensif(new Boule_de_feu());
    }
}
