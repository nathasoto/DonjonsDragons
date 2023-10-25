package Offensive.Arme;

import Players.Personnage;

public class Massue extends Arme {
    public Massue() {
        nomAttaque = "MASSUE";
        niveauAttaque = 3;
    }

    @Override
    public void interaction(Personnage player) {
        player.setForceDAttaque(getniveauAttaque()+this.niveauAttaque);
    }
}
