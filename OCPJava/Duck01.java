//Compareto()


import java.util.*;

public class Duck01 implements Comparable<Duck01> { // Comparable<Duck01> is correct
    private String name;

    public Duck01(String name) {
        this.name = name;
    }

    @Override
    public String toString() { // For readable output
        return name;
    }

    @Override
    public int compareTo(Duck01 d) { // Correct parameter type and annotation
        return this.name.compareTo(d.name); // Sorts ascendingly by name
    }

    public static void main(String[] args) {
        List<Duck01> ducks = new ArrayList<>(); // Use List instead of var for clarity
        ducks.add(new Duck01("Quack"));
        ducks.add(new Duck01("Puddles"));

        Collections.sort(ducks); // Now it should work without errors
        System.out.println(ducks); // [Puddles, Quack]
    }
}
