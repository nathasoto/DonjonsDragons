package Game;

import Players.Personnage;
import java.util.Scanner;;

public class MenuView {

    Scanner clavier;
    public MenuView(Scanner clavier) {
        this.clavier = clavier;
    }

    public String getDataString(String data){

        System.out.print("Player "+ data +" : ");
        data = clavier.nextLine();
        return data;

    }
    public void ShowPlayerData(Personnage player){
        player.toString();
    }
    public void messageErrorSelectPlayerType(){
        System.out.println("magicien or guerrier");
    }
    public void messageErrorNameType(){
        System.out.println("Insert Name and Type");
    }
}
