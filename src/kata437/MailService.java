package kata437;

public interface MailService {
    String AUSTIN_POWERS = "Austin Powers";
    String WEAPONS = "weapons";
    String BANNED_SUBSTANCE = "banned substance";

    Sendable processMail(Sendable mail);
}
