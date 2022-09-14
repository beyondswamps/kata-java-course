package kata437;

public class Thief implements MailService {
    private int minimalValue;
    private int stolenValue;

    public Thief(int minimalValue) {
        this.minimalValue = minimalValue;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() >= minimalValue) {
                stolenValue += ((MailPackage) mail).getContent().getPrice();
                Package newPackage = new Package(String.format(
                        "stones instead of %s", ((MailPackage) mail).getContent().getContent()), 0);
                mail = new MailPackage(((MailPackage) mail).from, ((MailPackage) mail).to, newPackage);
            }
        }
        return mail;
    }
}
