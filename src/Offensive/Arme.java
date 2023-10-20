package Offensive;

public class Arme extends EquipementOffensif{
    public Arme() {

        nomAttaque = "Arme_Ataque";
        niveauAttaque = 5;

    }

    @Override
    public int getniveauAttaque() {
        return this.niveauAttaque;
    }

    @Override
    public String getnomAttaque() {
        return this.nomAttaque;
    }
}
