package kata437;

public class Inspector implements MailService{
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getContent().equals(WEAPONS)
                    || ((MailPackage) mail).getContent().getContent().equals(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
            if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
