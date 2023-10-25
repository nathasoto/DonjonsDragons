package Potions;
import Game.ICase;

public abstract class Potion implements ICase {

    protected int pointdeVie;

    public abstract int getPoindevie();

    @Override
    public  String toString() {
        return  "Potion : rend "+Integer.toString(this.pointdeVie)+" points de vie";
    }


}
