package Ennemis;
import Game.ICase;

public abstract class Ennemi implements ICase {

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
