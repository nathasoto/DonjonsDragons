package Ennemis;

import Players.Personnage;

public class Sorcier extends Ennemi{

    public Sorcier() {
        nameEnnemi = "Sorcier";
        niveauAttaque = 2;
        vieEnnemi = 9;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getNiveauAttaque() {
        return super.getNiveauAttaque();
    }

    @Override
    public int getVieEnnemi() {
        return super.getVieEnnemi();
    }

    @Override
    public void interaction(Personnage player) {

        System.out.println(nameEnnemi);
    }
}
