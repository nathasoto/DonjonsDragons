import java.util.ArrayList;

public class EquipementDefensif {

    private String defensif = " ";
    private int niveauDefense = 0;
    private String nomDefense = "";

    private ArrayList<String> listDefensif = new ArrayList<String>();

    public void setEquipementDensif(String type){

        switch (type) {

            case "guerrier":

                this.defensif = "Bouclier";
                this.niveauDefense = 7;
                this.nomDefense = "Bouclier_Defensif";
                listDefensif.add(this.defensif);
                listDefensif.add(Integer.toString(this.niveauDefense));
                listDefensif.add(this.nomDefense );
                break;

            case "magicien":

                this.defensif = "Philtre";
                this.niveauDefense = 5;
                this.nomDefense = "Philtre_Defensif";
                listDefensif.add(this.defensif);
                listDefensif.add(Integer.toString(this.niveauDefense));
                listDefensif.add(this.nomDefense );
                break;

        }

    }

    public ArrayList<String> getEquipementDensif(){
        return this.listDefensif;
    }


}
