public class Main {
    public static void main(String[] args) {
        Observer app = new AppNotification();
        Observer mail = new MailNotification();
        Observer phone = new PhoneNotification();
        Account hieu = new Account();
        hieu.add(app);
        hieu.add(mail);
        hieu.notification("Chuyen cho anh Duyet 50tr");
        hieu.delete(mail);
        hieu.add(phone);
        hieu.notification("chuyen cho Toan 50t");
    }
}