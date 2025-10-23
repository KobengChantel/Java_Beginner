package practiceLesson2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest  {

  @Test
  public void shouldReturnHelloWorld(){
      Person marcus = new Person();
      assertEquals("Hello World",marcus.helloWorld());
  }
@Test
    public void shouldReturnMarcus(){
      Person person = new Person();
assertEquals("Hello  World",person.hello("Marcus"));
}

}
