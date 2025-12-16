package motto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

   private final Logger LOG = LoggerFactory.getLogger(carService.class)

    public void process(String input) {
//        log.isDebugEnabled()) {
//            log.debug("processing car: " + input);
//            log.error("processing car: " + input);
//            log.warn("processing car: " + input);
//        }

        CarState carState = CarState.from(input);
        System.out.println("valid State: " + carState);
    }
    //lesson 16
    public void drive(){


        Car[] cars = {new BMW(),new Porsche(), new Mercedes(), };
        for(Car car: cars){
            car.drive();
        }

    }
}
