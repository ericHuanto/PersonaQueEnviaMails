package org.example;

import java.util.Properties;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class EnvioSMTP implements EnvioParaMensajeAdapter{

  public EnvioSMTP() {}

  @Override
  public void enviarMensaje(String[] destinatarios, String asunto, String mensaje) {
    JavaMailSender mailSender1 = getJavaMailSender();
    SimpleMailMessage mailMessage = new SimpleMailMessage();

    mailMessage.setFrom("pruebadisenio2023@gmail.com");
    mailMessage.setTo(destinatarios);
    mailMessage.setSubject(asunto);
    mailMessage.setText(mensaje);

    mailSender1.send(mailMessage);
  }

  private JavaMailSender getJavaMailSender() {
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

    mailSender.setHost("smtp.gmail.com");
    mailSender.setPort(587);
    mailSender.setUsername("pruebadisenio2023@gmail.com");
    mailSender.setPassword("--zzz--");

    Properties props = mailSender.getJavaMailProperties();

    props.put("mail.transport.protocol", "smtp");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.debug", "true");

    return mailSender;
  }

}
