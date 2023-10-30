package Game;

import Players.Guerriers;
import Players.Magiens;
import Players.Personnage;

public class Case_vide implements ICase {

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
