package Ennemis;
import Game.Game;
import Game.ICase;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

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

    @Override
    public void interaction(Personnage player) {
        System.out.println(this.getClass());
    }


}
