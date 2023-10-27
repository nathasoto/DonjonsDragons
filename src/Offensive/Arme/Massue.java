package Offensive.Arme;

import Players.Guerriers;
import Players.Personnage;

public class Massue extends Arme {
    public Massue() {
        nomAttaque = "Massue";
        niveauAttaque = 3;
    }

    @Override
    public void interaction(Personnage player) {
        System.out.println(nomAttaque);
        if(player instanceof Guerriers){
            player.setForceDAttaque(getniveauAttaque() + this.niveauAttaque);
        }
    }
}
