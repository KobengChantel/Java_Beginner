package practiceLesson2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

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
    public void deonstrateArrays(){
        Person [] persons = new Person[4];  //creating an array of type person that can hold umber of person
    Person myPerson = new Person();
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        persons[3] = myPerson;
        myPerson = persons[2];
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