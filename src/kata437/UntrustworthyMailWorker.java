package kata437;

public class UntrustworthyMailWorker implements MailService{
    private RealMailService realMailService = new RealMailService();
    private MailService[] mailServices;

    public UntrustworthyMailWorker(MailService... mailServices) {
        this.mailServices = mailServices;
    }

    public MailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService mailService : mailServices) {
            mail = mailService.processMail(mail);
        }
        return getRealMailService().processMail(mail);
    }
}
