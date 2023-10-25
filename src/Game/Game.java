package Game;

import Ennemis.*;
import Offensive.Arme.Arme;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;
import Potions.Potion;


import java.util.ArrayList;

public class Game {

private int die = 0;
private Personnage player;
private ArrayList<ICase> plateau = new ArrayList<ICase>();
private Ennemi caseEnnemi;
private Arme caseArme;
private Potion casePotion;
private Case_vide case_vide;

public void setPlayer(String name,String type) {

    switch (type) {

        case "guerrier":
            player = new Guerriers(name);
            System.out.println(player.toString());
            break;
        case "magicien":
            player = new Magiens(name);
            System.out.println(player.toString());
            break;

    }
}

public void throwTheDie(){

    this.die = (int)(Math.random()*6+1);
}


public void jouer_un_tour(){

    throwTheDie();
    System.out.println("dé : "+this.die);

    player.setPlayerPosition(player.getPlayerPosition()+this.die);
    System.out.println("player position : "+ player.getPlayerPosition());

    int position = player.getPlayerPosition() -1;

    if(!(plateau.get(position) instanceof Case_vide )){ //diferente case vide

        System.out.println("Case : "+ plateau.get(player.getPlayerPosition()));

    }
    System.out.println("Case vide Continue ....: ");

}

public void modifierNamePerso(String name) {

    player.setName(name);
}

public void currentPlayer(){

   System.out.println(player.toString());
}
public void instancierPlateau(){


    for (int i =0; i < 64 ; i++){

        plateau.add(i,case_vide = new Case_vide());

    }

    plateau.set(45,caseEnnemi = new Dragon());
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



    for(ICase plato:plateau){
        System.out.println(plato);
    }

}

}
