package guilh.main;

public class TechEmployee extends Employee{

    @Override
    public void work() {
        System.out.println(name() + " solves issues. ");
    }

    @Override
    public String name() {
        return "Tech Employee";
    }
}