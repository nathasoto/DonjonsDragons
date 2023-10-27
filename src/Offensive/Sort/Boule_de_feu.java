package Offensive.Sort;

import Players.Magiens;
import Players.Personnage;

public class Boule_de_feu extends Sort {
    public Boule_de_feu() {
        nomAttaque = "Boule de feu";
        niveauAttaque = 7;
    }

    @Override
    public void interaction(Personnage player) {

        System.out.println(nomAttaque);
        player.setForceDAttaque(getniveauAttaque() + this.niveauAttaque);

    }
}
