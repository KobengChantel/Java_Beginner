package practiceLesson2;

import java.lesson3.Name;

public class Person {

        private Name personName; //instance variable
    private static int personCounter;

    public Person(Name personName){
this.personName =  personName;
    }
//default constructor has no parameter
// used to initialze an object

    public Person(){
        personCounter ++;
        /* multi line comment
        empty on purpose - default constructor
         */
        // single line comment
    }
        public String helloWorld(){ //instance method
        return "Hello World";
    }

    public String hello(String marcus) {
        return "Hello" + name; //+ to concatinate
    }

    public static int numberOfPersons(){
        return personCounter;
    }
}
