package kata437;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    public static final String AUSTIN_POWERS = "Austin Powers";
    private Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            String mailFrom = mail.getFrom();
            String mailTo = mail.getTo();
            if (mailFrom.equals(AUSTIN_POWERS) || mailTo.equals(AUSTIN_POWERS)){
                logger.log(Level.WARNING, String.format(
                        "Detected target mail correspondence: from %s to %s \"%s\"",
                        mailFrom, mailTo, ((MailMessage) mail).getMessage()));
            } else {
                logger.log(Level.INFO, String.format("Usual correspondence: from %s to %s", mailFrom, mailTo));
            }
        }
        return mail;
    }
}
