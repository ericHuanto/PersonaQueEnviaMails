package org.example;

public class Persona {

  private String nombre;
  private String apellido;
  private int edad;
  private EnvioParaMensajeAdapter envioDeMensaje;

  public Persona(String nombre, String apellido, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  public int getEdad() {
    return edad;
  }

  public String getNombre() {return nombre;}

  public void enviarMensaje(String mensaje, String... destinatarios) {
    envioDeMensaje.enviarMensaje(destinatarios, "pruebaDisenio", mensaje);
  }

  public void setEnvioDeMensaje(EnvioParaMensajeAdapter envioDeMensaje) {
    this.envioDeMensaje = envioDeMensaje;
  }

}
