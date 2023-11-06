package Potions;

public  class GrandePotion extends Potion{
    public GrandePotion() {
        PotionName = "Grande potion de vie";
        pointdeVie = 5;
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
