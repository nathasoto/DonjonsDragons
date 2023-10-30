package Offensive.Sort;

import Offensive.Arme.Massue;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public class Boule_de_feu extends Sort {
    public Boule_de_feu() {
        nomAttaque = "Boule de feu";
        niveauAttaque = 7;
    }

    @Override
    public void interaction(Personnage player) {


        if (player.getOffensif().getTypeOffensive() == "Sort") {

            if (player.getOffensif().getniveauAttaque() < this.niveauAttaque) {

                player.setOffensif(new Boule_de_feu());
                System.out.println(player.toString());
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
