
import java.io.IOException;

public class CarState {
    DRIVING, WAITING, PARKING;
    public static void main from(String state) throws Exception {
        switch(state) {
            case "DRIVING"
                ;
                return DRIVING;
            case "WAITING"
                ;
                return WAITING;
            case "PARKING"
                ;
                return PARKING;
            default:
                try{
                //checked exception
                //throw new Exception();
//unchecked exception
                //use for tthings u dont know how to handle them
                throw new Exception("unknown state" + state);
        }catch (Exception e){
         handleTheexception(state);   //e.printStackTrace();
        }
         }
    }
}
