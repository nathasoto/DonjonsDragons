package Game;

import Ennemis.*;
import Offensive.Arme.Arme;
import Offensive.Arme.Massue;
import Players.Personnage;
import Potions.Potion;
import Potions.Potion_Standard;



import java.util.ArrayList;
import java.util.Vector;

public class Game {
private int playerPosition = 1;

private int de = 0;
private ArrayList<Case> plateau ;

private Ennemi caseEnnemi;

private Arme caseArme;

private Potion casePotion;

private Case_vide case_vide;

public void starGame(){


    setarray();

 try {
      while ( playerPosition < 65) {

          diplayPosition();
          setLanzeDe();
          displayde();
          setPosition();
          //this.plateau.set(playerPosition);

     }
  } catch (Exception e){

      System.out.println("error");

    }

}

public int getPosition(){

    return this.playerPosition;
}
public void setLanzeDe(){

    this.de = (int)(Math.random()*6+1);

}
public void setPosition (){

    this.playerPosition = this.playerPosition + this.de;


}
public void diplayPosition(){
    System.out.println("case n/ : "+this.playerPosition);
}
public void displayde(){
    System.out.println("dé : "+this.de);
}
public void setarray(){
    for (int i=0; i <64; i++){
        //this.plateau.add(i,Integer.toString(i+1));
    }
}

public void jouer_un_tour(){

}
public void instancierPlateau(){

    plateau = new ArrayList<Case>();

    for (int i =0; i < 64 ; i++){

        plateau.add(i,case_vide = new Case_vide());

    }

    plateau.add(45,caseEnnemi = new Dragon());
    plateau.add(52,caseEnnemi = new Dragon());
    plateau.add(56,caseEnnemi = new Dragon());
    plateau.add(62,caseEnnemi = new Dragon());

    plateau.add(10,caseEnnemi = new Sorcier());
    plateau.add(20,caseEnnemi = new Sorcier());
    plateau.add(25,caseEnnemi = new Sorcier());
    plateau.add(32,caseEnnemi = new Sorcier());
    plateau.add(35,caseEnnemi = new Sorcier());
    plateau.add(36,caseEnnemi = new Sorcier());
    plateau.add(37,caseEnnemi = new Sorcier());
    plateau.add(40,caseEnnemi = new Sorcier());
    plateau.add(44,caseEnnemi = new Sorcier());
    plateau.add(47,caseEnnemi = new Sorcier());

    plateau.add(3,caseEnnemi = new Gobelin());
    plateau.add(6,caseEnnemi = new Gobelin());
    plateau.add(9,caseEnnemi = new Gobelin());
    plateau.add(12,caseEnnemi = new Gobelin());
    plateau.add(15,caseEnnemi = new Gobelin());
    plateau.add(18,caseEnnemi = new Gobelin());
    plateau.add(21,caseEnnemi = new Gobelin());
    plateau.add(24,caseEnnemi = new Gobelin());
    plateau.add(27,caseEnnemi = new Gobelin());
    plateau.add(30,caseEnnemi = new Gobelin());




    for(Case plato:plateau){
        System.out.println(plato);
    }

}

}
