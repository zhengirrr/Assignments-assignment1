package app;

public class Employee extends Human {
    public static String companyName = "MT2501";
    private String position;
    private Float salary;

    public Employee(int age, String name, boolean isMale, String position, Float salary){
        super(age, name, isMale);
        this.position = position;
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }
    public Float getSalary() {
        return salary;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }
    @Override
    public String getRole(){
        return "Employee";
    }
}
