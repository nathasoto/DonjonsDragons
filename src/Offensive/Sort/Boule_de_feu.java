package Offensive.Sort;

import Offensive.EquipementOffensif;
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

    @Override
    public int getLevelVieEnnemi() {
        return 0;
    }
}
