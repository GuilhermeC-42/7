package guilh.main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EmployeeFacade {
    private final List<Employee> workers;

    /**
     * Constructor.
     */
    public EmployeeFacade() {
        workers = Arrays.asList(
                new TechEmployee(),
                new HrEmployee());
    }

    public void startNewDay() {
        makeActions(workers, TechEmployee.Action.GO_TO_WORK, Employee.Action.WORK);
    }

    public void replyEmail() {
        makeActions(workers, TechEmployee.Action.SEND_EMAIL);
    }

    public void updateSheet() {
        makeActions(workers, TechEmployee.Action.UPDATE_SHEET);
    }

    private static void makeActions(
            Collection<Employee> workers,
            Employee.Action... actions
    ) {
        workers.forEach(worker -> worker.action(actions));
    }
}