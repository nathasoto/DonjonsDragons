package Defensive;

public class Bouclier extends EquipementDefensif{
    public Bouclier() {
        niveauDefense = 7;
        nomDefense = "Bouclier_Defensif";
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
