
package Book3.chapter2;

    public class Actor {
        private String lastName;
        private String firstName;
        private boolean goodActor;

        public Actor(String last, String first) {
            lastName = last;
            firstName = first;
        }

        public Actor(String last, String first, boolean good) {
            this(last, first);
            goodActor = good;
        }

        // Getter methods
        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public boolean isGoodActor() {
            return goodActor;
        }
    }
