package Ennemis;
import Game.Case;
import Players.Personnage;

public abstract class Ennemi implements Case {

    protected String nameEnnemi;
    protected int niveauAttaque;
    protected int vieEnnemi;

    @Override
    public String toString() {
        return "Ennemi : "+this.nameEnnemi;
    }
    public String getName() {

        return this.getName();
    }
    public int getNiveauAttaque() {

        return this.getNiveauAttaque();
    }

    public int getVieEnnemi() {

        return this.getVieEnnemi();
    }

}
