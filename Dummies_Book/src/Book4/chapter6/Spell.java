import java.util.ArrayList;

public class Spell {
    public String name;
    public SpellType type;
    public String description;

    public enum SpellType { SPELL, CHARM, CURSE }

    // Constructor
    public Spell(String spellName, SpellType spellType, String spellDescription) {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Description: " + description;
    }

    // Method to demonstrate adding spells and printing them
    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", SpellType.SPELL, "Makes invisible ink appear."));
        spells.add(new Spell("Avis", SpellType.SPELL, "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", SpellType.CHARM, "Enlarges something."));
        spells.add(new Spell("Fidelius", SpellType.CHARM, "Hides a secret within someone."));
        spells.add(new Spell("Finite Incantatum", SpellType.SPELL, "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", SpellType.CURSE, "Locks an opponent's legs."));

        // Print all spells
        for (Spell spell : spells) {
            System.out.println(spell);
        }
    }
}
