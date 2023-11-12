package Game;

import Ennemis.*;
import Offensive.EquipementOffensif;
import Potions.*;

import java.util.ArrayList;
import java.util.Collections;

public class BoardGame {
    private ArrayList<ICases> myBoardGame;

    public BoardGame() {

        this.myBoardGame = new ArrayList<ICases>();

    }

    public ArrayList getBoardGame() {
        return this.myBoardGame;
    }

    public void InsertEnnemisBoard(int howMany,Ennemi ennemi) {

        myBoardGame.addAll(Collections.nCopies(howMany,ennemi.getEnnemi()));
        Collections.shuffle(myBoardGame);//random

    }

    public void InsertOffensiveBoard(int howMany, EquipementOffensif offensif) {

        myBoardGame.addAll(Collections.nCopies(howMany,offensif.getOffesive()));
        Collections.shuffle(myBoardGame);

    }
    public void InsertPotionsBoard(int howMany, Potion potion) {

        myBoardGame.addAll(Collections.nCopies(howMany,potion.getPotion()));
        Collections.shuffle(myBoardGame);

    }
    public void InsertCaseVideBoard(int howMany) {

        myBoardGame.addAll(Collections.nCopies(howMany,new Case_vide()));
        Collections.shuffle(myBoardGame);

    }
    public ICases getCase(int position){
       return myBoardGame.get(position);
    }
    public Ennemi getCaseEnnemi(int position){
        return myBoardGame.get(position).getCaseEnnemi();
    }


}
