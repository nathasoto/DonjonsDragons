import java.util.Scanner;
import java.util.ArrayList;

public class EquipementOffensif {

    private String offensif = "";
    private int niveauAttaque = 0;
    private String nomAttaque = "";
    private ArrayList<String> listOffesif = new ArrayList<String>();

    public void setEquipementOffensif(String type){

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

    }

    public ArrayList<String> getEquipementOffensif(){
        return this.listOffesif;
    }
}
