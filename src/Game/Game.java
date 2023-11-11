package Game;

import Exceptions.ExceptionBoardNotImplemented;
import Exceptions.ExceptionOutOfBounds;
import Players.*;



public class Game {

    private int dice = 0;
    private Personnage player;


    public void setPlayer(String name, String type) {

        switch (type) {

            case "guerrier":
                player = new Guerriers(name);
                System.out.println(player.toString());
                break;
            case "magicien":
                player = new Magiens();//just for test
                System.out.println(player.toString());
                break;

        }
    }


    public void rollDice() {

        this.dice = (int) (Math.random() * 6 + 1);
    }

    public void jouer_un_tour() throws ExceptionBoardNotImplemented, ExceptionOutOfBounds {

        rollDice();
        System.out.println("dé : " + this.dice);



           player.setPlayerPosition(player.getPlayerPosition() + this.dice);
           System.out.println("player position : " + (player.getPlayerPosition()));

           //plateau.get(player.getPlayerPosition() - 1).interaction(player);


    }



    public void modifierNamePerso(String name) {

        player.setName(name);
    }


    public void currentPlayer() {

        System.out.println(player.toString());
    }

//    public void displayPlateau() {
//
//        System.out.println("________________________________");
//
//        for (int i = 0; i < plateau.size(); i++) {
//            System.out.println("Case : " + (i + 1)); // without brackets concatenate
//            System.out.println(plateau.get(i));
//
//        }
//
//        System.out.println("________________________________");
//
//    }


//    public void deleteEnnemi(int position) {
//
//        plateau.set(position, new Case_vide());
//        System.out.println("Now this Case =  " + plateau.get(player.getPlayerPosition() - 1));
//    }



}

