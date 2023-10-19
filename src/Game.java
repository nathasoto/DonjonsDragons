import java.util.ArrayList;
import java.util.Scanner;

public class Game {

private int playerPosition = 1;

private int de = 0;
private ArrayList<String> plateau = new ArrayList<String>();

public void starGame(){

    diplayPosition();

    while (this.playerPosition < 64) {

        setLanzeDe();
        displayde();
        setPosition();
        diplayPosition();

    }
}

/*public int getde(){

    return this.de;
}*/
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

}
