package Game;

import Players.Personnage;

public class Case_surprises implements Case{

    private String case_surprises;
    public Case_surprises() {
        case_surprises = "surprise";

    }

    @Override
    public String toString() {
        return this.case_surprises;
    }
    @Override
    public void interaction(Personnage player) {

    }
}
