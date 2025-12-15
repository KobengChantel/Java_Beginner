
import java.io.IOException;

public class CarSelector {
    public static void main(String[] arguments) throws Exception {

CarService carService = new CarService();
        for(String argument : arguments) {
             carService.process(argument);
             try{
                 carService.process(argument);
        } catch (RuntimeException e) {
                 //e.printStackTrace();//all methods that were called in reverse order
                 System.err.println(e.getMessage());
             }

    }
}
}