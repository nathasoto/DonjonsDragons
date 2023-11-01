package Game;

import Ennemis.*;
import Offensive.Arme.Epee;
import Offensive.Arme.Massue;
import Offensive.EquipementOffensif;
import Offensive.Sort.Boule_de_feu;
import Offensive.Sort.Eclair;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;
import Potions.GrandePotion;
import Potions.Potion;
import Potions.Potion_Standard;

import java.util.*;
import java.util.stream.Stream;
import java.util.List;

import static java.util.Collections.shuffle;

public class Game {

    private int die = 0;
    private Personnage player;
    private List<ICase> plateau;
    ArrayList<Integer> notRepeatRandom;


    private Ennemi caseEnnemi;
    private Potion casePotion;
    private Case_vide case_vide;
    private EquipementOffensif caseOffensif;


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
            System.out.println("player position : " + (player.getPlayerPosition()-1));


            plateau.get(player.getPlayerPosition()-1).interaction(player);


        } catch (Exception e) {
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

        int howManydragons = 4;
        int howManySorciers = 10;
        int howManyGobelins = 10;

        int howManyMassues = 5;
        int howManyEpees = 4;
        int howManyEclair = 5;
        int howManyBoulesDeFeu = 5;
        int howManyPotionStandars = 6;
        int howManyBigPotions = 2;
        int howManyCaseVide = 13;


        List<ICase> dragons = Collections.nCopies(howManydragons, new Dragon());
        List<ICase> Sorciers = Collections.nCopies(howManySorciers, new Sorcier());
        List<ICase> Gobelins = Collections.nCopies(howManyGobelins, new Gobelin());
        List<ICase> Massues = Collections.nCopies(howManyMassues, new Massue());
        List<ICase> Epees = Collections.nCopies(howManyEpees, new Epee());
        List<ICase> Eclair = Collections.nCopies(howManyEclair, new Eclair());
        List<ICase> BoulesDeFeu= Collections.nCopies(howManyBoulesDeFeu, new Boule_de_feu());
        List<ICase> potionStandars = Collections.nCopies(howManyPotionStandars, new Potion_Standard());
        List<ICase> BigPotions = Collections.nCopies(howManyBigPotions, new GrandePotion());
        List<ICase> CaseVide = Collections.nCopies(howManyCaseVide, new Case_vide());


        plateau  = new ArrayList<ICase>(Stream.of(dragons, Sorciers, Gobelins,Massues,Epees,Eclair,BoulesDeFeu,potionStandars,BigPotions,CaseVide ).flatMap(Collection::stream).toList());//concatenate List

        List <ICase> newp = new ArrayList<ICase>();



        for (int i=0 ; i < newp.size(); i++) {

            System.out.println(newp.get(i));
            System.out.println(newp.indexOf(newp.get(i)));

        }


        //Collections.shuffle(plateau);//random

    }

    public void displayPlateau() {

       /* System.out.println("________________________________");

        for (int i=0 ; i < plateau.size(); i++) {
            System.out.println(plateau.get(i));
            System.out.println(plateau.indexOf(plateau.get(i)));

        }

        System.out.println("________________________________");
        */

    }
    public void OldinstancierPlateau() {

        /*for(int i = 0; i < 64; i++){

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

            plateau.set(notRepeatRandom.get(i), caseOffensif= new Massue());
        }
        for (int i = 29; i < 33; i++) {

            plateau.set(notRepeatRandom.get(i), caseOffensif = new Epee());
        }
        for (int i = 33; i < 38; i++) {

            plateau.set(notRepeatRandom.get(i), caseOffensif = new Eclair());
        }
        for (int i = 38; i < 40; i++) {

            plateau.set(notRepeatRandom.get(i), caseOffensif = new Boule_de_feu());
        }
        for (int i = 40; i < 46; i++) {

            plateau.set(notRepeatRandom.get(i), casePotion = new Potion_Standard());
        }
        for (int i = 46; i < 48; i++) {

            plateau.set(notRepeatRandom.get(i), casePotion = new GrandePotion());
        }*/

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


}

