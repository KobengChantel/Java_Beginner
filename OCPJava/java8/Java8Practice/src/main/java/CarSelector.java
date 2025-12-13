public class CarSelector {
    public static void main(String[] arguments) {

CarService carService = new CarService();
        for(String argument : arguments) {
             carService.process(argument);

        }
        return 42;

    }
}
