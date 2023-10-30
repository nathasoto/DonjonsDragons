package Game;

import Ennemis.*;
import Offensive.Arme.Arme;
import Offensive.Arme.Epee;
import Offensive.Arme.Massue;
import Offensive.Sort.Boule_de_feu;
import Offensive.Sort.Eclair;
import Offensive.Sort.Sort;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;
import Potions.GrandePotion;
import Potions.Potion;
import Potions.Potion_Standard;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private int die = 0;
    private Personnage player;
    private ArrayList<ICase> plateau = new ArrayList<ICase>();
    ArrayList<Integer> notRepeatRandom;


    private Ennemi caseEnnemi;
    private Potion casePotion;
    private Case_vide case_vide;
    private Arme caseArme;
    private Sort caseSort;




    public void setPlayer(String name, String type) {

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

    public void throwTheDie() {

        this.die = (int) (Math.random() * 6 + 1);
    }

    public void jouer_un_tour() {

        try {
            throwTheDie();
            System.out.println("dé : " + this.die);

            player.setPlayerPosition(player.getPlayerPosition() + this.die);
            System.out.println("player position : " + player.getPlayerPosition());


            plateau.get(player.getPlayerPosition()).interaction(player);





        } catch (Exception e ){
            System.out.println("------------ 'instance Plateau'--------------------");
        }


    }

    public void modifierNamePerso(String name) {

        player.setName(name);
    }

    public void currentPlayer() {

        System.out.println(player.toString());
    }

    public void instancierPlateau() {

        for(int i = 0; i < 64; i++){

            plateau.add(i, case_vide = new Case_vide());
        }


        notRepeatRandom = randomNotRepeat();

        for (int i = 0; i < 4; i++) {

            plateau.set(notRepeatRandom.get(i), caseEnnemi = new Dragon());
        }
        for (int i = 4; i < 14; i++) {

            plateau.set(notRepeatRandom.get(i), caseEnnemi = new Sorcier());
        }
        for (int i = 14; i < 24; i++) {

            plateau.set(notRepeatRandom.get(i), caseEnnemi = new Gobelin());
        }
        for (int i = 24; i < 29; i++) {

            plateau.set(notRepeatRandom.get(i), caseArme = new Massue());
        }
        for (int i = 29; i < 33; i++) {

            plateau.set(notRepeatRandom.get(i), caseArme = new Epee());
        }
        for (int i = 33; i < 38; i++) {

            plateau.set(notRepeatRandom.get(i), caseSort = new Eclair());
        }
        for (int i = 38; i < 40; i++) {

            plateau.set(notRepeatRandom.get(i), caseSort = new Boule_de_feu());
        }
        for (int i = 40; i < 46; i++) {

            plateau.set(notRepeatRandom.get(i), casePotion = new Potion_Standard());
        }
        for (int i = 46; i < 48; i++) {

            plateau.set(notRepeatRandom.get(i), casePotion = new GrandePotion());
        }

    }
    public void instancierPlateau1(){

        List<ICase> plateau2 = new ArrayList<ICase>();
        ICase test = new Dragon();
        Collections.fill(plateau2,case_vide);

        List<Dragon> plateau3 = new ArrayList<Dragon>();

        ICase arr[] = new ICase[64];

        //ICase arr[] = {new Massue(), new Dragon(), new Case_vide()};

        Arrays.fill(arr,0,1,case_vide);

        //Arrays.fill(plateau,0,4,);
        //private ArrayList<ICase> plateau = new ArrayList<ICase>();



    }

    public ArrayList randomNotRepeat() {

        notRepeatRandom = new ArrayList<Integer>();

        while (notRepeatRandom.size() < 64) {

            int number = (int) (Math.random() * 64);

            if (!(notRepeatRandom.contains(number))) {

                notRepeatRandom.add(number);
            }
        }
        return notRepeatRandom;
    }

    public void displayPlateau(){

        System.out.println("________________________________");

        for (ICase plato : plateau) {
            System.out.print(plateau.indexOf(plato) + " : ");
            System.out.println(plato);
        }
        System.out.println("________________________________");
    }



}

