//private access
//package OCPJava.pond.duck;
public class FatherDuck {

    private String noise = "quack";
    private void quack() {
               System.out.print(noise);         // private access is ok
           }
  }
