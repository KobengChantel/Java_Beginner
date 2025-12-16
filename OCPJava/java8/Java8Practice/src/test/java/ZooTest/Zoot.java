package ZooTest;

import org.junit.Test;
public class Zoot {
    @Test
    public void shouldFeedAllAnimals(){
      Zoo zoo = new Zoo();
      Animal[] animals ={new Dog(), new Gorilla(), new Lion(), new Tiger(),};
      zoo.feedAllAnimals(animals);
    }
}
