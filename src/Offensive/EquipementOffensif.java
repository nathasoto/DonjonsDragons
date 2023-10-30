package Offensive;

import Game.ICase;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public abstract  class EquipementOffensif  implements ICase {
    protected String typeOffensive;
    protected int niveauAttaque;
    protected String nomAttaque ;

    public String toString(){
        return this.nomAttaque + " : Niveau : "+this.niveauAttaque;
    };
    public abstract int getniveauAttaque();
    public abstract String getnomAttaque();
    public String getTypeOffensive(){
        return this.typeOffensive;
    };
    @Override
    public void interaction(Personnage player) {

     System.out.println("you are " + player.getType()+" you can not take : "+this.toString());

    }


}
