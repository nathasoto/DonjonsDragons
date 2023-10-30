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


        if (player.getOffensif().getTypeOffensive() == "Sort") {

            if (player.getOffensif().getniveauAttaque() < this.niveauAttaque) {

                player.setOffensif(new Eclair());
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
