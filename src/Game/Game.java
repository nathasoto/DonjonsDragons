package Game;
import Ennemis.*;
import Offensive.Arme.*;
import Offensive.Sort.*;
import Players.*;
import Potions.*;
import java.util.*;
import java.util.stream.Stream;
import java.util.List;

/**
 * <h1>this class control Game's managment </h1>
 * this class allow player'creation and player board interaction
 *
 * @author nathalie.soto <a href="https://github.com/nathasoto/DonjonsDragons"> GitHub </a>
 * @version 1.0.0
 * @see Personnage
 * @see Offensive.EquipementOffensif
 * @see Ennemi
 * @see Potion
 * @since 1.0.0
 */

public class Game {

    private int die = 0;
    private Personnage player;
    private List<ICase> plateau;

    /**
     * Define a personnage according to type (Guerrier or Magicien)
     *
     * @param name String the personnage's name
     * @param type String the personnage's type
     */
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

    /**
     * Throw the dice, use the random method from 1 to 6
     */

    public void throwTheDie() {

        this.die = (int) (Math.random() * 6 + 1);
    }

    /**
     * Throw the dice and the personnage interacts with the game
     *
     * @throws "cannot instantiate the board if is not created"
     */
    public void jouer_un_tour() throws ExceptionBoardNotImplemented, ExceptionOutOfBounds {

        throwTheDie();
        System.out.println("dé : " + this.die);

//       try {

           player.setPlayerPosition(player.getPlayerPosition() + this.die);
           System.out.println("player position : " + (player.getPlayerPosition()));

           boardNotImplemented();// check if board is null
           boardOutOfBoundsException();
           plateau.get(player.getPlayerPosition() - 1).interaction(player);
//
//       }
//       catch (ExceptionBoardNotImplemented e){
//           System.out.println(e.getMessage());
//       }
//       catch (ExceptionOutOfBounds e) {
//           System.out.println(e.getMessage());
//       }

    }

    public void boardNotImplemented() throws ExceptionBoardNotImplemented {

        if (plateau == null) {
            throw new ExceptionBoardNotImplemented();
        }
    }

    public void boardOutOfBoundsException() throws ExceptionOutOfBounds{
        if(player.getPlayerPosition() > plateau.size()){
            throw new ExceptionOutOfBounds();
        }
    }

    /**
     * Modify personnage's name
     *
     * @param name String the personnage's name
     */

    public void modifierNamePerso(String name) {

        player.setName(name);
    }

    /**
     * Show current Player
     */
    public void currentPlayer() {

        System.out.println(player.toString());
    }

    /**
     * set board game and use random for that.
     */

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
        List<ICase> BoulesDeFeu = Collections.nCopies(howManyBoulesDeFeu, new Boule_de_feu());
        List<ICase> potionStandars = Collections.nCopies(howManyPotionStandars, new Potion_Standard());
        List<ICase> BigPotions = Collections.nCopies(howManyBigPotions, new GrandePotion());
        List<ICase> CaseVide = Collections.nCopies(howManyCaseVide, new Case_vide());

        plateau = new ArrayList<ICase>(Stream.of(dragons, Sorciers, Gobelins, Massues, Epees, Eclair, BoulesDeFeu, potionStandars, BigPotions, CaseVide).flatMap(Collection::stream).toList());//concatenate List

        Collections.shuffle(plateau);//random

    }

    /**
     * show the board game
     */
    public void displayPlateau() {

        System.out.println("________________________________");

        for (int i = 0; i < plateau.size(); i++) {
            System.out.println("Case : " + (i + 1)); // without brackets concatenate
            System.out.println(plateau.get(i));

        }

        System.out.println("________________________________");

    }

    /**
     * Delete ennemi who dont have life
     *
     * @param position int position de personnage in the board
     */
    public void deleteEnnemi(int position) {

        plateau.set(position, new Case_vide());
        System.out.println("Now this Case =  " + plateau.get(player.getPlayerPosition() - 1));
    }

    /**
     * @deprecated
     */
    /*public void oldInstancierPlateau() {

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
        }

    }*/

    /**
     *
     * @deprecated
     */
   /* public ArrayList randomNotRepeat() {

        notRepeatRandom = new ArrayList<Integer>();

        while (notRepeatRandom.size() < 64) {

            int number = (int) (Math.random() * 64);

            if (!(notRepeatRandom.contains(number))) {

                notRepeatRandom.add(number);
            }
        }
        return notRepeatRandom;
    }*/


}

