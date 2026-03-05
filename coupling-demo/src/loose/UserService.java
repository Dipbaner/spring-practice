package loose;



public class UserService {

   NotifiactionService notifiactionService;

    public UserService() {
        System.out.println("Default Constructor");
    }

    // Setter Injection
    public void setNotifiactionService(NotifiactionService notifiactionService) {
        this.notifiactionService = notifiactionService;
    }
// Constructor Injection

   public UserService(NotifiactionService notifiactionService){

       this.notifiactionService = notifiactionService;
   }

    public void notifyUser(String message){
        notifiactionService.send("Notification Hello");
    }
}