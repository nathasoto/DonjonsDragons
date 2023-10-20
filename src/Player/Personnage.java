package Player;
import java.util.ArrayList;

abstract public class Personnage { // Abstract classes cannot be instantiated (not constructor)
    protected String name;
    protected String type;
    protected int niveauDeVie;
    protected int forceDAttaque;
    protected String equipeOffensif;
    protected int niveauAttaque;
    protected String equipeDefensif;
    protected int niveauDefense;

    //Abstract methods cannot have a body
    abstract public String toString();
    abstract public String getType();




}
