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

        if (player.getOffensif().getTypeOffensive() == "Arme") {
            if (player.getOffensif().getniveauAttaque() < this.niveauAttaque) {

                player.setOffensif(new Epee());
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
