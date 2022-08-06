package guilh.main;

public class HrEmployee extends Employee{

    @Override
    public void work() {
        System.out.println(name() + " looks for new employees.");
    }

    @Override
    public String name() {
        return "Human Resources Assistant";
    }
}