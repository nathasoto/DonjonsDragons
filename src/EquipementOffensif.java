import java.util.Scanner;
import java.util.ArrayList;

public class EquipementOffensif {

    String offensif = "";
    int niveauAttaque = 0;
    String nomAttaque = "";

    private void equipementOffensif(){

        this.offensif = offensif;
        this.niveauAttaque = niveauAttaque;
        this.nomAttaque = nomAttaque;

    }

    public ArrayList<String> getEquipementOffensif(String type){

        ArrayList<String> listOffesif = new ArrayList<String>();


        switch (type) {

            case "guerrier":

                this.offensif = "Arme";
                this.niveauAttaque = 5;
                this.nomAttaque = "Arme_Ataque";
                listOffesif.add(this.offensif);
                listOffesif.add(Integer.toString(this.niveauAttaque));
                listOffesif.add(this.nomAttaque);
                break;

            case "magicien":

                this.offensif = "Sort";
                this.niveauAttaque = 10;
                this.nomAttaque = "Sort_Ataque";
                listOffesif.add(this.offensif);
                listOffesif.add(Integer.toString(this.niveauAttaque));
                listOffesif.add(this.nomAttaque);
                break;

        }

        return listOffesif;
    }




}
