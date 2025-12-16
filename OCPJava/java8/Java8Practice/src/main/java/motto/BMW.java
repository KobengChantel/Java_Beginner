import motto.Asset;
import motto.Car;
import motto.Loggable;
import motto.Property;

public class BMW implements Car, Loggable, Asset, Property {
    public void drive(){
        System.out.println("motto.BMW driving...");
    }
}public int value(){
    return 80000;
}
public String owner(){
    return "Marcus";
}
public String message(){
return "I am the car of Marcus";
}
