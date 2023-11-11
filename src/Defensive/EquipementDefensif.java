package Defensive;

 public abstract class EquipementDefensif {

    private String nomDefense ;
    private int niveauDefense;

     protected EquipementDefensif(String nomDefense,int niveauDefense) {

         this.nomDefense = nomDefense;
         this.niveauDefense = niveauDefense;
     }

     public int getniveauDefense() {
         return this.niveauDefense;
     }

     public String getnomDefense() {
         return this.nomDefense;
     }

}
