package Potions;

import Players.Personnage;

public  class Potion_Standard extends Potion {
    public Potion_Standard() {
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
    public void interaction(Personnage player) {

        player.setNiveauDeVie(player.getNiveauDeVie() +this.pointdeVie);

    }
}
