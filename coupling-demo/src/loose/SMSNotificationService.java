package loose;

public class SMSNotificationService implements NotifiactionService {
    @Override
    public void send(String message) {
        System.out.println("SMS : "+message);
    }
}
