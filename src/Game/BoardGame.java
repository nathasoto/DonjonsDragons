package Game;

import Ennemis.*;
import Offensive.Arme.*;
import Offensive.Sort.*;
import Potions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class BoardGame {

    private ArrayList<ICases> myBoardGame;
    private int positionSurLePlateau;

    public BoardGame() {

        myBoardGame = new ArrayList<ICases>();
    }

    public void initializeBoardGame() {

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

        List<ICases> dragons = Collections.nCopies(howManydragons, new Dragon());
        List<ICases> Sorciers = Collections.nCopies(howManySorciers, new Sorcier());
        List<ICases> Gobelins = Collections.nCopies(howManyGobelins, new Gobelin());
        List<ICases> Massues = Collections.nCopies(howManyMassues, new Massue());
        List<ICases> Epees = Collections.nCopies(howManyEpees, new Epee());
        List<ICases> Eclair = Collections.nCopies(howManyEclair, new Eclair());
        List<ICases> BoulesDeFeu = Collections.nCopies(howManyBoulesDeFeu, new Boule_de_feu());
        List<ICases> potionStandars = Collections.nCopies(howManyPotionStandars, new Potion_Standard());
        List<ICases> BigPotions = Collections.nCopies(howManyBigPotions, new GrandePotion());
        List<ICases> CaseVide = Collections.nCopies(howManyCaseVide, new Case_vide());

        myBoardGame = new ArrayList<ICases>(Stream.of(dragons, Sorciers, Gobelins, Massues, Epees, Eclair, BoulesDeFeu, potionStandars, BigPotions, CaseVide).flatMap(Collection::stream).toList());//concatenate List

        Collections.shuffle(myBoardGame);//random

    }

}
