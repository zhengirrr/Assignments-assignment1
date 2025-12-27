package app;

public class Employee extends Human implements IWorker, ILearner {
    private String position;
    private float salary;

    public Employee(String name, int age, boolean male, String position, float salary) {
        super(name, age, male);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getRole() {
        return "Employee";
    }

    @Override
    public void work() {
        System.out.println(name + " is working as " + position);
    }

    @Override
    public void getSalaryInfo() {
        System.out.println(name + "Salary: " + salary);
    }

    @Override
    public void study() {
        System.out.println(name + " is studying new subject");
    }

    @Override
    public void takeExam() {
        System.out.println(name + " passed a qualification exam");
    }
}