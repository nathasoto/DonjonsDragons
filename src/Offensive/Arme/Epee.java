package Offensive.Arme;

import Offensive.EquipementOffensif;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public class Epee extends EquipementOffensif{
    public Epee() {

        nomAttaque = "Epée";
        niveauAttaque = 5;
    }
    @Override
    public void setNewOffensive(Personnage player) {
        player.setOffensif(new Epee());
    }

    @Override
    public int getLevelVieEnnemi() {
        return 0;
    }
}
