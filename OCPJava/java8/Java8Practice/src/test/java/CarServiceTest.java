import motto.CarService;
import org.junit.Test;

public class CarServiceTest {
    @Test
    public void shouldDemonstrateLogging(){
        CarService carService = new CarService();
        carService.drive();
    }
}
