package Game;

import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public class GameController {

    private MenuView menuView;
    private BoardGame boardGame;
    private Personnage player;
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
                starGame();
        }
    }
    public void starGame(){

        setPlayer();
        boardGame.initializeBoardGame();
    }
    public void setPlayer(){

        String name = menuView.getDataString("Name");
        String type = menuView.getDataString("Type");

        if(!name.isEmpty() && !type.isEmpty()){
            addPlayer(name,type);
            menuView.ShowPlayerData(player);
        }
        else {
            menuView.messageErrorNameType();
            starGame();
        }
    }


}
