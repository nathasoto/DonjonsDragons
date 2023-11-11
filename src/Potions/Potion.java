package Potions;
import Game.ICaseSurprise;
import Players.Personnage;

public abstract class Potion implements ICaseSurprise {

    protected String potionName;
    protected int pointdeVie;

    public Potion(String potionName, int pointdeVie) {

        this.potionName = potionName;
        this.pointdeVie = pointdeVie;
    }

    @Override
    public  String toString() {
        return  "Potion : rend "+Integer.toString(this.pointdeVie)+" points de vie";
    }

    @Override
    public void interaction(Personnage player) {

        player.setNiveauDeVie(player.getNiveauDeVie() +this.pointdeVie);
        System.out.println(this.potionName);
        System.out.println("New Vie Level : "+player.getNiveauDeVie());

    }


}
