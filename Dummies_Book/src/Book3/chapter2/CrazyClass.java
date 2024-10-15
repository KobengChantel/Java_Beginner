package Book3.chapter2;

public class CrazyClass {
    private String firstString;
    private String secondString;

    // Constructor that initializes both fields
    public CrazyClass(String first, String second) {
        firstString = first;
        secondString = second;
    }

    // Constructor that sets a default value for the second string
    public CrazyClass(String first) {
        this(first, "DEFAULT"); // Sets the secondString to "DEFAULT"
    }

    // Optional: Add getter methods to test the class
    public String getFirstString() {
        return firstString;
    }

    public String getSecondString() {
        return secondString;
    }
}
