package Game;

import java.util.ArrayList;
public class Game {
private int playerPosition = 1;

private int de = 0;
private ArrayList<Case> plateau = new ArrayList<Case>();

public void starGame(){
    setarray();

  try {
      while ( playerPosition < 65) {

          diplayPosition();
          setLanzeDe();
          displayde();
          setPosition();
          //this.plateau.set(playerPosition);

      }
  } catch (Exception e){

      System.out.println("error");

    }

}

public int getPosition(){

    return this.playerPosition;
}
public void setLanzeDe(){

    this.de = (int)(Math.random()*6+1);

}
public void setPosition (){

    this.playerPosition = this.playerPosition + this.de;


}
public void diplayPosition(){
    System.out.println("case n/ : "+this.playerPosition);
}
public void displayde(){
    System.out.println("dé : "+this.de);
}
public void setarray(){
    for (int i=0; i <64; i++){
        //this.plateau.add(i,Integer.toString(i+1));
    }
}



}
