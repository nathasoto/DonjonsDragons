package Potions;

import Players.Personnage;

public  class GrandePotion extends Potion{
    public GrandePotion() {
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
    public void interaction(Personnage player) {

        player.setNiveauDeVie(player.getNiveauDeVie() +this.pointdeVie);

    }
}
