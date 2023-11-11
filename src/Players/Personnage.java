package Players;
import Defensive.EquipementDefensif;
import Game.ICombat;
import Offensive.EquipementOffensif;

/**
 * <h1>Define a Personnage</h1>
 *
 * @author nathalie.soto <a href="https://github.com/nathasoto/DonjonsDragons"> GitHub </a>
 * @version 1.0.0
 * @since 1.0.0
 */

public abstract class Personnage implements ICombat { // Abstract classes cannot be instantiated (not constructor)

    private String name;
    private int forceDAttaque;
    private int niveauDeVie;
    private EquipementOffensif offensif;
    private EquipementDefensif defensif;
    private int vie_max;
    private int attaque_max;
    private int playerPosition=1;
    private String type;

    /**
     * Constructor for the Guerriers class
     *@param forceDAttaque int the personnage's force Attaque
     *@param niveauDeVie int the personnage's level of live
     *@param offensif EquipementOffensif the personnage's offensif
     *@param defensif EquipementDefensif the personnage's defencif
     *@param vie_max int the personnage's vie max
     *@param attaque_max int the personnage's attaque max
     *@param type String the personnage's type
     *
     */
    protected Personnage(String name, int forceDAttaque, int niveauDeVie, EquipementOffensif offensif, EquipementDefensif defensif, int vie_max, int attaque_max, String type) {

        this.name = name;
        this.forceDAttaque = forceDAttaque;
        this.niveauDeVie = niveauDeVie;
        this.offensif = offensif;
        this.defensif = defensif;
        this.vie_max = vie_max;
        this.attaque_max = attaque_max;
        this.type = type;

    }
    /**
     *
     * @return  character string  used to describe the object.
     */
    public String toString() {

        return this.type + '\n' +
                " name= " + name + '\n' +
                " niveauDeVie= " + niveauDeVie + '\n' +
                " forceDAttaque= " + forceDAttaque + '\n' +
                " Offensif= " + offensif.getnomAttaque() + '\n' +
                " OffensifNiveau= " + offensif.getniveauAttaque() + '\n' +
                " Defensif= " + defensif.getnomDefense() + '\n' +
                " DefensifNiveau= " + defensif.getniveauDefense()
                ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForceDAttaque() {
        return forceDAttaque;
    }

    public void setForceDAttaque(int forceDAttaque) {
        this.forceDAttaque = forceDAttaque;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public EquipementOffensif getOffensif() {
        return offensif;
    }

    public void setOffensif(EquipementOffensif offensif) {
        this.offensif = offensif;
    }

    public EquipementDefensif getDefensif() {
        return defensif;
    }

    public void setDefensif(EquipementDefensif defensif) {
        this.defensif = defensif;
    }

    public int getVie_max() {
        return vie_max;
    }

    public void setVie_max(int vie_max) {
        this.vie_max = vie_max;
    }

    public int getAttaque_max() {
        return attaque_max;
    }

    public void setAttaque_max(int attaque_max) {
        this.attaque_max = attaque_max;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void combat() {

    }
}
