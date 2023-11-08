package Offensive;

import Game.ICase;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public abstract  class EquipementOffensif  implements ICase {
    protected int niveauAttaque;
    protected String nomAttaque ;

    public EquipementOffensif(String nomAttaque, int niveauAttaque) {

        this.nomAttaque = nomAttaque;
        this.niveauAttaque = niveauAttaque;
    }

    public String toString(){
        return this.nomAttaque + " : Niveau : "+this.niveauAttaque;
    };
    public  int getniveauAttaque(){
        return this.niveauAttaque;
    };
    public  String getnomAttaque(){
        return this.nomAttaque;
    };



    @Override
    public void interaction(Personnage player) {

        Package packageplayerOffesif = player.getOffensif().getClass().getPackage();//player offesive package
        Package packagecaseOffesif = getClass().getPackage();// case offesive package

        if (packageplayerOffesif  ==  packagecaseOffesif) {

            if (player.getOffensif().getniveauAttaque() < this.niveauAttaque) {

                player.setOffensif(this);
                System.out.println(player.toString());
            }
            else{

                System.out.println("you have : "+player.getOffensif().getnomAttaque()+" et  this case : "+this.nomAttaque);
            }

        }
        else{
            System.out.println("you are " + player.getType()+" you can not take : "+this.toString());
        }


    }


}
