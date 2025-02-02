//CompareTo()
public class Animal2 implements Comparable<Animal2> {
    private int id;

    // Constructor to set id
    public Animal2(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Animal2 a) {
        return this.id - a.id; // Sorts ascending by id
    }

    public static void main(String[] args) {
        var a1 = new Animal2(5);  // Correct class name & constructor usage
        var a2 = new Animal2(7);

        System.out.println(a1.compareTo(a2)); // -2
        System.out.println(a1.compareTo(a1)); // 0
        System.out.println(a2.compareTo(a1)); // 2
    }
}
