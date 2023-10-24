package Offensive;

import Game.Case;
import Players.Personnage;

public abstract  class EquipementOffensif  implements Case{
    protected int niveauAttaque;
    protected String nomAttaque ;

    public String toString(){
        return this.nomAttaque + " : Niveau : "+this.niveauAttaque;
    };
    public abstract int getniveauAttaque();
    public abstract String getnomAttaque();


}
