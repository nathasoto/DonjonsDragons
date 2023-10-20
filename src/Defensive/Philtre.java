package Defensive;
public class Philtre extends EquipementDefensif{
    public Philtre() {

        niveauDefense = 5;
        nomDefense = "Philtre_Defensif";
    }

    @Override
    public int getniveauDefense() {
        return this.niveauDefense;
    }

    @Override
    public String getnomDefense() {
        return this.nomDefense;
    }
}
