import java.util.Scanner;
import java.util.ArrayList;
public class Personnage {

    private String type;
    private String name;
    private int forceDAttaque;
    private int niveauDeVie;
    private ArrayList<String> equipeOffensif = new ArrayList<String>();
    private ArrayList<String> equipeDefensif = new ArrayList<String>();

    EquipementOffensif offensif = new EquipementOffensif();

    public void setPersonnage() {



        this.name = "maximo";
        this.type = "magicien";
        this.forceDAttaque = 15;
        this.niveauDeVie = 6;
        this.equipeOffensif = offensif.getEquipementOffensif(getType());


    }

    public void setPersonnage(String name){

        this.name = name;
        this.type = "guerrier";
        this.forceDAttaque = 10;
        this.niveauDeVie = 10;
        this.equipeOffensif = offensif.getEquipementOffensif(getType());

    }
    public void setPersonnage(String name, String type){

        this.name = name;
        this.type = type;

        switch (type) {

            case "guerrier":

                this.forceDAttaque = 10;
                this.niveauDeVie = 10;
                EquipementOffensif offensif = new EquipementOffensif();
                this.equipeOffensif = offensif.getEquipementOffensif(getType());
                break;

            case "magicien":

                this.forceDAttaque = 6;
                this.niveauDeVie = 15;
                break;

        }

    }

    public String getName(){

        return this.name;
    }

    public String getType(){

        return this.type;

    }


    public void displayPlayer(){
        System.out.print("------------------------------\n"+"Nom : "+ this.name+ "\n"+ "Type : "+this.type + "\n"+ "Force d'attaque : "+this.forceDAttaque + "\n"+ "Niveau de Vie : "+this.niveauDeVie+"\n"+"Equipement Offensif"+this.equipeOffensif);
    }

    /*public void setPlayer(){

        if(name.isEmpty() && type.isEmpty()) {

            this.setPersonnageDefault();
        }

        if(!name.isEmpty() && !type.isEmpty()){

            this.setPersonnageAvecNomType(name,type);
        }

    }*/

}
