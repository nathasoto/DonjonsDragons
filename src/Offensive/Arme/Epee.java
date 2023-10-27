package Offensive.Arme;

import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public class Epee extends Arme {
    public Epee() {

        nomAttaque = "Epée";
        niveauAttaque = 5;
    }

    @Override
    public void interaction(Personnage player) {

        System.out.println(nomAttaque);
        if((player instanceof Guerriers) && (player.getOffensif().getniveauAttaque() < this.niveauAttaque )){

            player.setForceDAttaque(getniveauAttaque() + this.niveauAttaque);
            System.out.println(player.getOffensif().getniveauAttaque());
        }
    }
}
