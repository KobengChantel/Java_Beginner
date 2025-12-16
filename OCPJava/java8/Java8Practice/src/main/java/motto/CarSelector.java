package motto;

import java.io.IOException;

public class CarSelector {
    public static void main(String[] arguments) throws Exception {

CarService carService = new CarService();
        for(String argument : arguments) {
           if(  validate(argument)) {
               carService.process(argument);
//             try{
//                 carService.process(argument);
//        } catch (RuntimeException e) {
//                 //e.printStackTrace();//all methods that were called in reverse order
//                 System.err.println(e.getMessage());
//             }
           }else {
               System.out.println("Ignoring invalid argument:" + argument);
           }
    }
}

    private static boolean isValid(String argument) {
      try {
          CarState carstate= CarState.valueOf(argument);
          System.out.println("Valid arguent" + argument);
      } catch(InvalidStateException e) {
          IOException e2 = new IOException("my IOException")
          System.out.println("hello again" + e.getMessage ());
//          return false;

      } finally {
//          IOUtils.close();
//          closeResource(myResource);
          System.out.println("Iam afinal block");
      }
      return true;
    }
}