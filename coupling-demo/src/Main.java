import loose.EmailNotifiactionService;
import loose.NotifiactionService;
import loose.SMSNotificationService;
import tight.UserService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();

        userService.notifyUser("Order Placed");

        NotifiactionService notifiactionService = new EmailNotifiactionService();

        NotifiactionService notifiactionService1 = new SMSNotificationService();

        loose.UserService userService1= new loose.UserService(notifiactionService1);
        userService1.notifyUser("Order placed");

        loose.UserService userService2 = new loose.UserService();
        userService2.setNotifiactionService(notifiactionService1);
        userService2.notifyUser("New Message");


    }

}