package practiceLesson2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonTest {
//lesson 10
    static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    //lesson 11
    private static final int PROCESSED = 42;
    private static final int PROCESSING = 41;
    private static final int PENDING = 43;

public String[] states() {
    return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
}

    //lesson 1-5
    @Test
    public void shouldReturnHelloWorld() {
        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnMarcus() {
        Person person = new Person();
        assertEquals("Hello World", person.hello("Marcus"));

    }
//lesson6
    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        assertEquals(4, Person.numberOfPersons());

    }

    //lesson 8
    @Test
    public void shouldReturnNumberOfPersonsInLoop(){
        Person person1;
        int i = 0;

//        do {//condition is checked after execution
//            i++;
//        } while( i < 4);
//        }

        while( i < 4){
            person1 = new Person();

            i++;
       }
        for( int i = 0; i < 4; i++ ){
            person1 = new Person();
   }
       assertEquals(4, Person.numberOfPersons());

    }

    //lesson 9
    @Test
    public void demonstrateArrays(){
        Person [] persons = new Person[4];  //creating an array of type person that can hold umber of person
       persons [0] = new Person();
        persons [1] = new Person();
        persons [2] = new Person();
        persons [3] = new Person();

        for( int i=0; i < persons.length; i++ ){
//            persons = new Person();
            persons[i] = new Person();

            for( int i = 0; i < persons.length; i++ ){

                persons[i] = new Person();
        }
for(Person person : persons){
    person.helloWorld();
}

//lesson 10
            Person myPerson = new Person();
            Person myPerson2= null;
            //Person[] person2 = {persons[0], persons[3], null, myPerson, myPerson2 };
            Person[] person2 = {persons[0], persons[3],myPerson, myPerson2,persons[2],persons[2], new Person() ,};

            LoggingLevel state = LoggingLevel.PROCESSING;
//lesson 11
            int myState = PENDINGS;
            String myString = "something";
            char myState = ' d';
            myState = 300;
            String myString = "myString"
            switch(myState) {
                default;
                someOtherMethod();
                break;
                case PENDING;
/*
falls through
 */
                case "Something";
                    callMethod();
                break;


            }
            //end of lesson 11

 for( LoggingLevel state: LoggingLevel.values()){
                }
                if (state == LoggingLevel.PENDING) {
                    callMethod();
                }
                if (state == LoggingLevel.Processing) {
                    callMethod();
                }
                if (state == LoggingLevel.Processed) {
                    callMethod();
                }
            }
}
        }

//lesson7
    @Test
    public void demonstrateBooleanLesson() {
        int i = 4;
        int j = 3;
        boolean monday = false;
        boolean raining = true;
        if (shouldDrinkBeer(i, j, monday, raining)) {
drinkBeer();
        }
        if(i == j){
            raining = true;
        }
        if(monday || raining ){
            i = 34;
            j = 91;
            i = i + j;
            drinkbeer();
        } else if(j > i){
            i++;
            j =56;
        }else if ( i != j){
            i = 8;
        }
else {
    j--;
        }
    }
    private boolean shouldDrinkBeer(int i, int j, boolean monday, boolean raining){
        retun  i < j || ((monday && !raining) || j > 3);
    }
}