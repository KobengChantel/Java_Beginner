//Crocodile.java

public class Crocodile extends Reptile {
protected int speed = 20;
public int getSpeed(){
return speed;}
public static void main (String [] data) {
    var croc = new Crocodile();
    System.out.println(croc.getSpeed());
}

}
