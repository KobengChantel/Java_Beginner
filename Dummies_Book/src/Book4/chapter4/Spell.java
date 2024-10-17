package Book4.chapter4;

import java.util.ArrayList; // Importing the ArrayList class for dynamic array functionality
import java.util.Iterator;  // Importing the Iterator interface for iterating over collections

// Class representing a Spell
public class Spell {
    // Instance variables for the Spell class
    public String name;        // The name of the spell
    public SpellType type;     // The type of the spell (e.g., SPELL, CHARM, CURSE)
    public String description;  // A description of what the spell does

    // Constructor to initialize a Spell object
    public Spell(String spellName, SpellType spellType, String spellDescription) {
        this.name = spellName;          // Assign the spell name
        this.type = spellType;          // Assign the spell type
        this.description = spellDescription; // Assign the spell description
    }

    // Override the toString method to provide a string representation of the Spell object
    @Override
    public String toString() {
        return "Name: " + this.name + ", Type: " + this.type + ", Description: " + this.description;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create an ArrayList to hold Spell objects
        ArrayList<Spell> spells = new ArrayList<>(); // Using generic ArrayList for Spell objects

        // Adding Spell objects to the ArrayList
        spells.add(new Spell("Aparecium", SpellType.SPELL, "Makes invisible ink appear."));
        spells.add(new Spell("Avis", SpellType.SPELL, "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", SpellType.CHARM, "Enlarges something."));
        spells.add(new Spell("Fidelius", SpellType.CHARM, "Hides a secret within someone."));
        spells.add(new Spell("Finite Incantatum", SpellType.SPELL, "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", SpellType.CURSE, "Locks an opponent's legs."));

        // Create an iterator to traverse the spells ArrayList
        Iterator<Spell> var2 = spells.iterator();

        // Iterate over the spells and print each one
        while (var2.hasNext()) {
            Spell spell = var2.next(); // Retrieve the next Spell object
            System.out.println(spell);  // Print the Spell object using its toString method
        }
    }

    // Enum to represent different types of spells
    public static enum SpellType {
        SPELL,
        CHARM,
        CURSE;

        // Private constructor for the enum (not needed but can be included for clarity)
        private SpellType() {
        }
    }
}
