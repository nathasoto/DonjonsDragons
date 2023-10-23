package Player;
import Defensive.EquipementDefensif;
import Offensive.EquipementOffensif;

import java.util.ArrayList;

public abstract class Personnage { // Abstract classes cannot be instantiated (not constructor)
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
    public abstract void setName(String name);
    public abstract String getName();
    public abstract String getType();




}
