import java.sql.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Personnage {
    String type = "guerrier";
    String name = "natha";


    public static void main(String[] args) {

       setpersonnage(type,name);

    }
    private void personnage (String type, String name,int niveauDeVie, int forceDAttaque, String equipeOffensif, String equipeDefensif ) {

        this.type = type;
        this.name = name;
        this.niveauDeVie = 0;
        this.forceDAttaque =0;
        this.equipeOffensif = "";
        this.equipeDefensif = "";

    }

     public static void setpersonnage (String type, String name){

         personnage newplayer = new personnage(type,name);

         if(newplayer.type == "guerrier"){

             newplayer.type = "guerrier";
             newplayer.name = name;
             newplayer.forceDAttaque = 10;
             newplayer.forceDAttaque = 10;
             newplayer.equipeOffensif = "arme";
             newplayer.equipeDefensif = "bouclier";

         }
         if(newplayer.type == "magicien"){

             newplayer.type = "magicien";
             newplayer.name = name;
             newplayer.forceDAttaque = 6;
             newplayer.forceDAttaque = 15;
             newplayer.equipeOffensif = "philtre";
             newplayer.equipeDefensif = "sort";

         }

         System.out.print("Nom :"+newplayer.name+"Type :"+newplayer.type);
     }



}
