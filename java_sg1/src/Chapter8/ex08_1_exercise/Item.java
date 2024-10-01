package Chapter8.ex08_1_exercise;



    public class Item {
        char color;

        // Declare and code the setColor method.

        public boolean setColor(char colorCode){
            if (colorCode == ' '){
                return false;
            }
            else {
                this.color = colorCode;
<<<<<<< HEAD
                System.out.println(colorCode);
                return true;

            }

=======
                return true;
            }
>>>>>>> origin/main
        }
    }


