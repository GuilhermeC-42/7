package guilh.main;

public class App {

    public static void main(String[] args) {
        EmployeeFacade facade = new EmployeeFacade();
        facade.startNewDay();
        facade.updateSheet();
        facade.replyEmail();
    }
}