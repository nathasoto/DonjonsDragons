package Offensive.Sort;

import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public class Eclair extends Sort{
    public Eclair() {
        nomAttaque = "Eclair";
        niveauAttaque= 2;
    }

    @Override
    public void interaction(Personnage player) {
        System.out.println(nomAttaque);
        if(player instanceof Magiens){

            player.setForceDAttaque(getniveauAttaque() + this.niveauAttaque);
        }
    }
}
