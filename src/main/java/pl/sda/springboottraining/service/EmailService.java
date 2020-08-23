package pl.sda.springboottraining.service;

public interface EmailService {

    void sendSimpleMessage(
            String to, String subject, String text);
}
