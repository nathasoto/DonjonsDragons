package Potions;
import Game.ICase;
import Players.Personnage;

public abstract class Potion implements ICase {

    protected String PotionName;
    protected int pointdeVie;

    public abstract int getPoindevie();

    @Override
    public  String toString() {
        return  "Potion : rend "+Integer.toString(this.pointdeVie)+" points de vie";
    }

    @Override
    public void interaction(Personnage player) {

        player.setNiveauDeVie(player.getNiveauDeVie() +this.pointdeVie);
        System.out.println(this.PotionName);
        System.out.println("New Vie Level : "+player.getNiveauDeVie());

    }
}
