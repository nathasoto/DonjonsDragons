package Ennemis;

import Game.ICases;
import Game.ICombat;
import Players.Personnage;

public abstract class Ennemi implements ICombat, ICases {

    private String nameEnnemi;
    private int niveauAttaque;
    private int vieEnnemi;

    protected Ennemi(String nameEnnemi, int niveauAttaque, int vieEnnemi) {

        this.nameEnnemi = nameEnnemi;
        this.niveauAttaque = niveauAttaque;
        this.vieEnnemi = vieEnnemi;
    }

    public int getVieEnnemi(){
        return this.vieEnnemi;
    }
    public Ennemi getEnnemi(){
        return this;
    }

    @Override
    public Ennemi getCaseEnnemi() {
        return this;
    }

    @Override
    public void interaction(Personnage player) {

        int force = player.getForceDAttaque() + player.getOffensif().getniveauAttaque();

        System.out.println("Your Force is : "+force);
        System.out.println("Case : "+this.getClass().getSimpleName()+ " Life :"+ this.vieEnnemi);

        this.vieEnnemi = this.vieEnnemi - force;

        if(this.vieEnnemi <=0 ){

            System.out.println("you kill Ennemi");
            System.out.println("Vie Ennemi  : "+ this.vieEnnemi);
            this.vieEnnemi =0;


        }
        else{

            player.setNiveauDeVie(player.getNiveauDeVie() - this.niveauAttaque) ;
            System.out.println("Ennemi push you ");
            System.out.println("your level Life is  :"+player.getNiveauDeVie());
        }

    }

    @Override
    public void combat() {

    }

    @Override
    public String toString() {
        return this.nameEnnemi;
    }
}
