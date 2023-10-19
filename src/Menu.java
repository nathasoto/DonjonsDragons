import java.util.Scanner;


public class Menu {

    Personnage newPlayer = new Personnage();

    public void menu(){

        Scanner clavier = new Scanner(System.in);

        int sousmenu = 0;
        boolean arret = false;
        while (!arret){
            System.out.println("-----------------------------");
            System.out.println("--DONJONS  &  DRAGONS--");
            System.out.println("-----------------------------");
            System.out.println("Player : tapez 1");
            System.out.println("Play : tapez 2");
            System.out.println("quitter : tapez 9");
            sousmenu = clavier.nextInt();
            switch(sousmenu)
            {
                case 1 :{
                    int choix = 0;
                    System.out.println("-----------------------------");
                    System.out.println("---PLAYER---");
                    System.out.println("-----------------------------");
                    System.out.println("Set Player : tapez 1");
                    System.out.println("Modifie Player: tapez 2");
                    System.out.println("quitter : tapez 9");
                    choix = clavier.nextInt();

                    switch(choix){
                        case 1 : System.out.println("-----------------------------");
                                 System.out.println("---SET PLAYER---");
                                 System.out.println("-----------------------------");
                                 clavier.nextLine();
                                 System.out.print("Name : ");
                                 String name = clavier.nextLine();

                                 System.out.print("Type de personnage guerrier ou magicien : ");
                                 String type = clavier.nextLine();

                                    newPlayer.setPlayer(name,type);
                                    newPlayer.displayPlayer();
                                    System.out.println("\n");
                                    System.out.println("-----------------------------");

                        break;
                        case 2 :System.out.println("-----------------------------");
                                System.out.println("---MODIFIE CURRENT PLAYER---");
                                System.out.println("-----------------------------");

                                newPlayer.displayPlayer();

                                System.out.println("\n-----------------------------");

                                clavier.nextLine();
                                System.out.print("New name : ");
                                String newname = clavier.nextLine();

                                System.out.print("New type de personnage guerrier ou magicien : ");
                                String newtype = clavier.nextLine();

                                System.out.println("---PLAYER MODIFIE ---");
                                newPlayer.setPlayer(newname,newtype);
                                newPlayer.displayPlayer();
                                System.out.println("\n");
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


}
