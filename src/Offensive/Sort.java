package Offensive;

public class Sort extends EquipementOffensif {
    public Sort() {
        niveauAttaque = 10;
        nomAttaque = "Sort_Ataque";
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
