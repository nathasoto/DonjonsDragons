package Game;

import Player.Guerriers;
import Player.Magiens;
import Player.Personnage;

import java.util.Scanner;

public class Menu {

    private boolean arret = false;
    protected Personnage newPlayer;

    Scanner clavier = new Scanner(System.in);
    public void afficherMenuAccueil(){

        while (!arret){

            System.out.println("-----------------------------");
            int menu = firstMenu();
            System.out.println("-----------------------------");

            switch(menu)
            {
                case 1 :
                    System.out.println("-----------------------------");
                    setPlayerMenu();
                    System.out.println("-----------------------------");
                    break;

                case 2:
                    System.out.println("-----------------------------");
                    modifierInfoPerso();
                    System.out.println("-----------------------------");
                    break;

                case 3:
                    System.out.println("-----------------------------");
                    menuStartGame();
                    System.out.println("-----------------------------");
                    break;
                case 9 :
                    quitter();
                    break;

                default : System.out.println("entrez un choix entre 1-2-3 ou 9"); break;
            }
        }


    }

   public void setPlayer(String name,String type){

       switch (type){

           case "guerrier":
               newPlayer = new Guerriers(name);
               System.out.println(newPlayer.toString());
               break;
           case "magicien":
               newPlayer = new Magiens(name);
               System.out.println(newPlayer.toString());
               break;

       }
   }
   public int firstMenu(){

       System.out.println("--DONJONS  &  DRAGONS--");
       System.out.println("-----------------------------");
       System.out.println("1. Set player");
       System.out.println("2. Modify Player");
       System.out.println("3. Start Game");
       System.out.println("9. quitter");
       int choix = clavier.nextInt();
       return choix;
   }

   public void setPlayerMenu(){

       System.out.println("---SET PLAYER---");
       System.out.println("-----------------------------");

       clavier.nextLine();
       System.out.print("Name : ");
       String name = clavier.nextLine();

       System.out.print("Type de personnage guerrier ou magicien : ");
       String type = clavier.nextLine();

       setPlayer(name,type);

   }
   public void quitter(){

       arret = true;
       System.out.println("GAME OVER");
   }

   public void modifierInfoPerso(){

       System.out.println("---MODIFY PLAYER---");
       System.out.println("-----------------------------");
       System.out.println("---CURRENT PLAYER---");
       System.out.println(newPlayer.getName());
       System.out.println(newPlayer.getType());

       clavier.nextLine();
       System.out.print("Do you want change the name? y/n");
       boolean choixModifyName = clavier.nextBoolean();

       if(choixModifyName){
           clavier.nextLine();
           System.out.print("New name : ");
           String name = clavier.nextLine();
           newPlayer.setName(name);
       }

       System.out.print("Do you want change the type? y/n");
       boolean choixModifytype = clavier.nextBoolean();

       if(choixModifytype){
           clavier.nextLine();
           System.out.print("New type : ");
           String type = clavier.nextLine();
           setPlayer(newPlayer.getName(),type);
       }

   }
   public void menuStartGame(){
       System.out.println("---START---");
       System.out.println("-----------------------------");
       Game newGame = new Game();
       newGame.starGame();
   }

}
