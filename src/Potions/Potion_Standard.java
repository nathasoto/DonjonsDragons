package Potions;

public  class Potion_Standard extends Potion {
    public Potion_Standard() {
        PotionName = "Potion de vie standard";
        pointdeVie = 2;
    }

    @Override
    public int getPoindevie() {
        return this.pointdeVie;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getLevelVieEnnemi() {
        return 0;
    }
}
