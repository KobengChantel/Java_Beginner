//package pond.goose;                   // Different package than Bird
// import pond.shore.Bird;
public class Gosling extends Bird {
    public void swim() {
        floatInWater();                 // protected access is ok
        System.out.print(text);         // protected access is ok
    }
    public static void main(String[] args) {
        new Gosling().swim();
    }
}// Gosling is a subclass of Bird

