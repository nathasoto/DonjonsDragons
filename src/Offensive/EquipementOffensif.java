package Offensive;

import Game.ICase;
import Players.Magiens;
import Players.Personnage;

public abstract  class EquipementOffensif  implements ICase {
    protected String TypeOffensive;
    protected int niveauAttaque;
    protected String nomAttaque ;

    public String toString(){
        return this.nomAttaque + " : Niveau : "+this.niveauAttaque;
    };
    public abstract int getniveauAttaque();
    public abstract String getnomAttaque();

    @Override
    public void interaction(Personnage player) {



    }
}
