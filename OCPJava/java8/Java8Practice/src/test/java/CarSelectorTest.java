import motto.CarSelector;
import org.junit.Test;

public class CarSelectorTest {

    @Test
    public void shouldCallMain(){
        String [] arguments = {"BMw", "motto.Porsche"};
        int returnValue = CarSelector.main(arguments);
    }
}
