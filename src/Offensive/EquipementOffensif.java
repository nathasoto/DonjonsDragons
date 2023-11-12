package Offensive;

import Ennemis.Ennemi;
import Game.ICases;
import Players.Personnage;

public abstract  class EquipementOffensif  implements ICases {
   private int niveauAttaque;
    private String nomAttaque ;

    protected EquipementOffensif(String nomAttaque, int niveauAttaque) {

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

    public EquipementOffensif getOffesive(){
        return this;
    }

    @Override
    public Ennemi getCaseEnnemi() {
        return null;
    }

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
