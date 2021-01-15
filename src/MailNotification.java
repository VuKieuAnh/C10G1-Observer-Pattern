public class MailNotification implements Observer {
    @Override
    public void update(String mess) {
        System.out.println("Mail" + mess);
    }
}