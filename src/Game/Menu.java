package Game;

import Exceptions.ExceptionBoardNotImplemented;
import Exceptions.ExceptionOutOfBounds;

import java.util.Scanner;


public class Menu {

    private boolean arret = false;
    private Scanner clavier = new Scanner(System.in);
    private Game newGame = new Game();

    public void afficherMenuAccueil() {

        while (!arret) {

            System.out.println("-----------------------------");
            int menu = firstMenu();
            System.out.println("-----------------------------");

            switch (menu) {
                case 1:
                    System.out.println("-----------------------------");
                    setPlayerMenu();
                    System.out.println("-----------------------------");
                    break;

                case 2:
                    System.out.println("-----------------------------");
                    ModifiePlayerMenu();
                    System.out.println("-----------------------------");
                    break;

                case 3:
                    System.out.println("-----------------------------");
                   // instancierPlateau();
                    System.out.println("-----------------------------");
                    break;

                case 4:
                    System.out.println("-----------------------------");
                    menuStartGame();
                    System.out.println("-----------------------------");
                    break;
                case 9:
                    quitter();
                    break;

                default:
                    System.out.println("entrez un choix entre 1-2-3 ou 9");
                    break;
            }
        }

    }

    public int firstMenu() {

        System.out.println("--DONJONS  &  DRAGONS--");
        System.out.println("-----------------------------");
        System.out.println("1. Set player");
        System.out.println("2. Modify Player");
        System.out.println("3. Instancier Plateau");
        System.out.println("4. Start Game");
        System.out.println("9. quitter");
        int choix = clavier.nextInt();
        return choix;
    }

    public void setPlayerMenu() {

        System.out.println("---SET PLAYER---");
        System.out.println("-----------------------------");

        clavier.nextLine();
        System.out.print("Name : ");
        String name = clavier.nextLine();

        System.out.print("Type de personnage guerrier ou magicien : ");
        String type = clavier.nextLine();

        newGame.setPlayer(name, type);

    }

    public void ModifiePlayerMenu() {

        String name = "maximo";

        System.out.println("---MODIFY PLAYER---");
        System.out.println("-----------------------------");
        System.out.println("---CURRENT PLAYER---");
        newGame.currentPlayer();
        clavier.nextLine();
        System.out.print("Do you want change the name? : ");
        boolean choixModifyName = clavier.nextBoolean();

        if (choixModifyName) {
            clavier.nextLine();
            System.out.print("New name : ");
            name = clavier.nextLine();
            newGame.modifierNamePerso(name);
        }

        System.out.print("Do you want change the type? : ");
        boolean choixModifytype = clavier.nextBoolean();

        if (choixModifytype) {
            clavier.nextLine();
            System.out.print("New type : ");
            String type = clavier.nextLine();
            newGame.setPlayer(name, type);

        }
        newGame.currentPlayer();
    }

    public void quitter() {
        arret = true;
        System.out.println("GAME OVER");
    }

    public void menuStartGame() {
        System.out.println("---START---");
        System.out.println("-----------------------------");

        try {
            newGame.jouer_un_tour();
        } catch (ExceptionBoardNotImplemented e) {
            System.out.println(e.getMessage());
        } catch (ExceptionOutOfBounds e) {
            System.out.println(e.getMessage());
        }
    }

//    public void instancierPlateau() {
//
//        newGame.instancierPlateau();
//        newGame.displayPlateau();
//
//    }


}
