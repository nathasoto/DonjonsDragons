package Players;
import Defensive.EquipementDefensif;
import Offensive.EquipementOffensif;

public abstract class Personnage  { // Abstract classes cannot be instantiated (not constructor)
    protected String name;
    protected int forceDAttaque;
    protected int niveauDeVie;
    protected EquipementOffensif offensif;
    protected EquipementDefensif defensif;
    protected int vie_max;
    protected int attaque_max;
    private int playerPosition=1;

    //Abstract methods cannot have a body
    public abstract  String toString();
    public  void setName(String name){
        this.name = name;
    };
    public  String getName() {
        return this.name;
    };
    public void setForceDAttaque(int forceDAttaque) {
        this.forceDAttaque = forceDAttaque;
    }
    public int getForceDAttaque() {
        return this.forceDAttaque;
    }
    public int getNiveauDeVie() {
        return niveauDeVie;
    }
    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }
    public int getPlayerPosition() {
        return playerPosition;
    }
    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public EquipementOffensif getOffensif() {
        return offensif;
    }
    public void setOffensif(EquipementOffensif offensif) {
        this.offensif = offensif;
    }
}
