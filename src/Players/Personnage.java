package Players;
import Defensive.EquipementDefensif;
import Game.Case;
import Offensive.EquipementOffensif;

public abstract class Personnage  { // Abstract classes cannot be instantiated (not constructor)
    protected String name;
    protected String type;
    protected int niveauDeVie;
    protected int forceDAttaque;
    protected EquipementOffensif newOffesif ;
    protected EquipementDefensif newDefensif;
    protected int vie_max;
    protected int attaque_max;


    //Abstract methods cannot have a body
    public abstract  String toString();
    public  void setName(String name){

        this.name = name;
    };
    public  String getName() {
        return this.name;
    };
    public  String getType(){
        return this.type;
    };




}
