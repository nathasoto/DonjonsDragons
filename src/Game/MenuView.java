package Game;

import Players.Personnage;

import java.util.ArrayList;
import java.util.Scanner;;

public class MenuView {

    Scanner clavier;
    public MenuView(Scanner clavier) {
        this.clavier = clavier;
    }

    public String getDataString(String data){// call from game controller

        System.out.print("Player "+ data +" : ");
        data = clavier.nextLine();
        return data;

    }
    public void showPlayerData(Personnage player){
        System.out.println(player.toString());
    }
    public void showBoardGame(ArrayList myboardGame){

        System.out.println("------------BOARD GAME----------");

        for (int i = 0; i < myboardGame.size(); i++) {
            System.out.println("Case : " + (i + 1)); // without brackets concatenate
            System.out.println(myboardGame.get(i));

        }

        System.out.println("________________________________");

    }
    public void showDice(int dice){
        System.out.println("Dice = "+dice);
    }

    public void showPlayerPosition(int position){
        System.out.println("Position the player = "+position);
    }
    public void messageErrorSelectPlayerType(){
        System.out.println("magicien or guerrier");
    }
    public void messageErrorNameType(){
        System.out.println("Insert Name and Type");
    }
}
