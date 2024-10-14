package Book2.chapter4;
//The ^ operator performs what in the world of logic is known as an Exclusive Or,
//commonly abbreviated as Xor. It returns true if one — and only one — of the two
//subexpressions is true. If both expressions are true, or if both expressions are
//false, the ^ operator returns false
public class SwitchChecker {

        public static void main(String[] args) {
            // Sample values for switch1 and switch2
            int switch1 = 1;  // You can change this value to test different cases
            int switch2 = -1; // You can change this value to test different cases

            // Check if the switches are different using the XOR operator
            if ((switch1 == 1) ^ (switch2 == -1)) {
                System.out.println("OK, the switches are different.");
            } else {
                System.out.println("Trouble! The switches are the same.");
            }
        }
    }


