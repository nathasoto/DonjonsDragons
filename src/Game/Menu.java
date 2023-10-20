package Game;

import Player.Guerriers;
import Player.Magiens;
import java.util.Scanner;

public class Menu {

    Scanner clavier = new Scanner(System.in);
    public void menu(){

        boolean arret = false;

        while (!arret){

            System.out.println("-----------------------------");
            int menu = firstMenu();
            System.out.println("-----------------------------");

            switch(menu)
            {
                case 1 :{

                    int choix = playerMenu();
                    switch(choix){
                        case 1 :

                            System.out.println("-----------------------------");
                            setPlayerMenu();
                            System.out.println("-----------------------------");

                        break;
                        case 2 :System.out.println("-----------------------------");
                                setPlayerMenu();
                                System.out.println("-----------------------------");

                        break;
                        case 9 : arret = true; break;
                        default : System.out.println("entrez un choix entre 1 ou 2"); break;
                    }
                } break;
                case 2:

                    Game newGame =new Game();
                    newGame.starGame();

                    if(newGame.getPosition() >=64){
                        break;
                    }

                case 9 :
                    arret = true;
                    System.out.println("see you later");
                    break;

                default : System.out.println("entrez un choix entre 1-2-3 ou 9"); break;
            }
        }


    }

   public void setPlayer(String name,String type){

       switch (type){

           case "guerrier":
               Guerriers newGuerrier = new Guerriers(name);
               System.out.println(newGuerrier.toString());
               break;
           case "magicien":
               Magiens newMagicien = new Magiens(name);
               System.out.println(newMagicien.toString());
               break;

       }
   }
   public int firstMenu (){


       System.out.println("--DONJONS  &  DRAGONS--");
       System.out.println("-----------------------------");
       System.out.println("1.player");
       System.out.println("2. play ");
       System.out.println("9. quitter");
       int choix = clavier.nextInt();
       return choix;
   }
   public int playerMenu(){

       System.out.println("---PLAYER---");
       System.out.println("-----------------------------");

       System.out.println("1. set player ");
       System.out.println("2. modifie player");
       System.out.println("9. quitter ");
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

}
