import org.example.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest {

  @Test
  public void creacionDeUnaPersona(){
    Persona persona1 = new Persona("eric", "Huanto", 27);

    Assertions.assertEquals("eric", persona1.getNombre());
    Assertions.assertEquals(27,persona1.getEdad());
  }

}
