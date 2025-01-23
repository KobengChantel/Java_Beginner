public class Beetle extends Insect {
    protected int numberOfLegs = 6; // Shadowing the field in Insect
    short age = 3;

    public void printData() {
        System.out.println(this.label);        // Refers to `label` inherited from Insect
        System.out.println(super.label);      // Refers to `label` in the superclass (Insect)
        System.out.println(this.age);         // Refers to `age` in Beetle
        System.out.println(this.numberOfLegs); // Refers to `numberOfLegs` in Beetle
        System.out.println(super.numberOfLegs); // Refers to `numberOfLegs` in the superclass (Insect)
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }
}


