package Game;

import Ennemis.Dragon;
import Ennemis.Ennemi;
import Ennemis.Gobelin;
import Offensive.Arme.Massue;
import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;
import Potions.GrandePotion;
import Potions.Potion_Standard;

public class GameController {

    private MenuView menuView;
    private BoardGame boardGame;
    private Personnage player;
    private int dice;
    public GameController(MenuView menuView,BoardGame boardGame) {

        this.menuView = menuView;
        this.boardGame= boardGame;
    }
    public void addPlayer(String playerName,String playerType){

        switch (playerType) {

            case "guerrier":
                player = new Guerriers(playerName);
                break;
            case "magicien":
                player = new Magiens(playerName);
                break;
            default:
                menuView.messageErrorSelectPlayerType();
        }
    }
    public void starGame(){

        setPlayer();
        menuView.showPlayerData(player);
        initializeBoardGame(4 ,10,10,5,4,5,5,6, 2,13);
        menuView.showBoardGame(boardGame.getBoardGame());
        jouer_un_tour();

    }
    public void setPlayer(){

        String name = menuView.getDataString("Name");
        String type = menuView.getDataString("Type");

        if(!name.isEmpty() && !type.isEmpty()){
            addPlayer(name,type);
        }
        else {
            menuView.messageErrorNameType();
        }
    }
    public void initializeBoardGame(int drangons, int gobelins, int sorciers, int massues,int eppes, int eclairs, int boulesDeFeu , int potionsStandart,int potionsGrande, int caseVide ){

        boardGame.InsertEnnemisBoard(drangons,new Dragon());
        boardGame.InsertEnnemisBoard(gobelins,new Gobelin());
        boardGame.InsertEnnemisBoard(sorciers,new Gobelin());

        boardGame.InsertOffensiveBoard(massues, new Massue());
        boardGame.InsertOffensiveBoard(eppes, new Massue());
        boardGame.InsertOffensiveBoard(eclairs, new Massue());
        boardGame.InsertOffensiveBoard(boulesDeFeu, new Massue());

        boardGame.InsertPotionsBoard(potionsStandart, new Potion_Standard());
        boardGame.InsertPotionsBoard(potionsGrande, new GrandePotion());

        boardGame.InsertCaseVideBoard(caseVide);
    }

    public int rollDice() {

        this.dice = (int) (Math.random() * 6 + 1);
        return dice;

    }
    public int NewplayerPosition(){

        player.setPlayerPosition(player.getPlayerPosition() + this.dice);
        return player.getPlayerPosition();
    }

    public void  getionInteraction(){

         boardGame.getCase(player.getPlayerPosition() - 1).interaction(player);

    }
    public void jouer_un_tour(){

        menuView.showDice(rollDice());//roll the dice and send to view for show
        menuView.showPlayerPosition(NewplayerPosition());//set new position de player and send to view
        getionInteraction();//going to case interraction

    }
    public void checkEnnemiLife(int position){

        if(boardGame.getCase(position) instanceof Ennemi){
            boardGame.getCaseEnnemi(position).getVieEnnemi();
        }
      //boardGame.getCaseEnnemi(position).getVieEnnemi();

    }
    public void deletetEnnemi(Ennemi enemi){

    }

}
