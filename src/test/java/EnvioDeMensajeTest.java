import org.example.EnvioSMTP;
import org.example.Persona;
import org.junit.jupiter.api.Test;

public class EnvioDeMensajeTest {

  @Test
  public void enviarMensajeAUnaPersona() {
    Persona persona1 = new Persona("eric", "Huanto", 27);
    persona1.setEnvioDeMensaje(new EnvioSMTP());
    persona1.enviarMensaje("siLLega que emocion", "ericleohuanto@gmail.com");
  }

  @Test
  public void enviarMensajeAVariasPersonas() {
    Persona persona1 = new Persona("eric", "Huanto", 27);
    persona1.setEnvioDeMensaje(new EnvioSMTP());

    persona1.enviarMensaje("siLLega que emocion", "ericleohuanto@gmail.com", "erichuantocabrera@frba.utn.edu.ar");
  }

}
