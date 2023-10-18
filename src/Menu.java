import java.util.Scanner;


public class Menu {

    public void menu(){

        System.out.print("Would you like to play? : ");
        Scanner clavier = new Scanner(System.in);



        if(clavier.nextBoolean()) {

            System.out.println("Great! This will be fun.");
            clavier.nextLine();
            System.out.print("nom : ");
            String name = clavier.nextLine();

            System.out.print("Type de personnage guerrier ou magicien : ");
            String type = clavier.nextLine();
            clavier.close();

            Personnage newPlayer = new Personnage();

            newPlayer.setPlayer(name,type);

            newPlayer.displayPlayer();

        }else {
            System.out.println("Maybe next time");
        }
        clavier.close();
    }



}
