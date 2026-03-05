package loose;

public class EmailNotifiactionService implements NotifiactionService{
    @Override
    public void send(String message) {
        System.out.println("Email : "+message);
    }
}
