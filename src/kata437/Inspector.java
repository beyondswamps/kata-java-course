package kata437;

public class Inspector implements MailService{

    private static final String WEAPONS = "weapons";
    private static final String BANNED_SUBSTANCE = "banned substance";
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getContent().contains(WEAPONS)
                    || ((MailPackage) mail).getContent().getContent().contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
            if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
