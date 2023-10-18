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
    EquipementDefensif defensif = new EquipementDefensif();

    public void setPersonnage() {

        this.name = "maximo";
        this.type = "magicien";
        this.forceDAttaque = 15;
        this.niveauDeVie = 6;
        offensif.setEquipementOffensif(this.type);
        this.equipeOffensif = offensif.getEquipementOffensif();
        defensif.setEquipementDensif(this.type);
        this.equipeDefensif = defensif.getEquipementDensif();

    }

    public void setPersonnage(String name){

        this.name = name;
        this.type = "guerrier";
        this.forceDAttaque = 10;
        this.niveauDeVie = 10;
        offensif.setEquipementOffensif(this.type);
        this.equipeOffensif = offensif.getEquipementOffensif();
        defensif.setEquipementDensif(this.type);
        this.equipeDefensif = defensif.getEquipementDensif();

    }
    public void setPersonnage(String name, String type){

        this.name = name;
        this.type = type;

        switch (type) {

            case "guerrier":

                this.forceDAttaque = 10;
                this.niveauDeVie = 10;
                offensif.setEquipementOffensif(this.type);
                this.equipeOffensif = offensif.getEquipementOffensif();
                defensif.setEquipementDensif(this.type);
                this.equipeDefensif = defensif.getEquipementDensif();
                break;

            case "magicien":

                this.forceDAttaque = 6;
                this.niveauDeVie = 15;
                offensif.setEquipementOffensif(this.type);
                this.equipeOffensif = offensif.getEquipementOffensif();
                defensif.setEquipementDensif(this.type);
                this.equipeDefensif = defensif.getEquipementDensif();
                break;

        }

    }

    public void displayPlayer(){
        System.out.print("------------------------------\n"+"Nom : "+ this.name+ "\n"+ "Type : "+this.type + "\n"+ "Force d'attaque : "+this.forceDAttaque + "\n"+ "Niveau de Vie : "+this.niveauDeVie+"\n"+"Equipement Offensif"+this.equipeOffensif +"\n"+"Equipement Defensif"+this.equipeDefensif);
    }

    public void setPlayer(String name, String type){

        if(name.isEmpty() && type.isEmpty()) {

            this.setPersonnage();
        }

        if(!name.isEmpty() && !type.isEmpty()){

            this.setPersonnage(name,type);
        }
        if(!name.isEmpty() && type.isEmpty()) {
            this.setPersonnage(name);
        }

    }

}
