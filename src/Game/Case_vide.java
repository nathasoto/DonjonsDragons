package Game;

import Players.Personnage;

public class Case_vide implements ICases {

    private String case_vide;
    public Case_vide() {

         case_vide= "Case Vide";
    }

    @Override
    public String toString() {
        return this.case_vide;
    }
    @Override
    public void interaction(Personnage player) {
        System.out.println("Tour suivant.....");
    }


}
