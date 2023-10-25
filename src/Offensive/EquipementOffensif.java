package Offensive;

import Game.ICase;

public abstract  class EquipementOffensif  implements ICase {
    protected int niveauAttaque;
    protected String nomAttaque ;

    public String toString(){
        return this.nomAttaque + " : Niveau : "+this.niveauAttaque;
    };
    public abstract int getniveauAttaque();
    public abstract String getnomAttaque();


}
