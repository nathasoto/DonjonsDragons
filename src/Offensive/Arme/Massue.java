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


        if (player.getOffensif().getTypeOffensive() == "Arme") {

            if (player.getOffensif().getniveauAttaque() < this.niveauAttaque) {

                player.setOffensif(new Massue());
                System.out.println(toString());
            }
            else{
                System.out.println("you have : "+player.getOffensif().getnomAttaque()+"  this case : "+this.nomAttaque);
            }

        }
        else{
            super.interaction(player);
        }
    }
}
