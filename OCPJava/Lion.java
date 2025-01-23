public class Lion {
    int hunger = 4; // Instance variable, available throughout the class.

    public int feedZooAnimals() {
        int snack = 10; // Local variable, accessible only within this method.

        if (snack > 4) {
            long dinnerTime = snack++; // Local variable, accessible only within this 'if' block.
            hunger--; // Modifies the instance variable.
        }

        return snack; // Returns the modified value of the local variable 'snack'.
    }
}
