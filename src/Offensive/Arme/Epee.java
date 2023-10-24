package Offensive.Arme;

import Players.Personnage;

public class Epee extends Arme {
    public Epee() {
        nomAttaque = "EPEE";
        niveauAttaque = 5;
    }

    @Override
    public void interaction(Personnage player) {
        super.interaction(player);
    }
}
