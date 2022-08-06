package guilh.main;

import java.util.Arrays;

public abstract class Employee {
    public void goToWork() {
        System.out.println(name() + " goes to work.");
    }

    public void sendEmail() {
        System.out.println(name() + " sends an email.");
    }

    public void updateSheet() {
        System.out.println(name() + " updates a report.");
    }

    private void action(Action action) {
        switch (action) {
            case SEND_EMAIL:
                sendEmail();
                break;
            case UPDATE_SHEET:
                updateSheet();
                break;
            case GO_TO_WORK:
                goToWork();
                break;
            case WORK:
                work();
                break;
            default:
                System.out.println("Undefined action");
                break;
        }
    }

    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }

    public abstract void work();

    public abstract String name();

    enum Action {
        GO_TO_WORK, SEND_EMAIL, UPDATE_SHEET, WORK
    }
}