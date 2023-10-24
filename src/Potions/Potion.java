package Potions;
import Game.Case;
import Players.Personnage;

public abstract class Potion implements Case {

    protected int pointdeVie;

    public abstract int getPoindevie();

    @Override
    public  String toString() {
        return  "Potion : rend "+Integer.toString(this.pointdeVie)+" points de vie";
    }


}
