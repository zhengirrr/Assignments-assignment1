package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        app.Human human = new app.Human(24, "August", true);

        Employee employee = new Employee(0, "", true, "", 0.1);
        app.Student student = new Student(21, "Ammi", false, "Computer Science", 3.7f);


        System.out.print("Enter employee name: ");
        employee.setName(scanner.nextLine());

        System.out.print("Enter employee age: ");
        employee.setAge(scanner.nextInt());

        System.out.print("Is male? (true/false): ");
        employee.setMale(true);


        scanner.nextLine();

        System.out.print("Enter position: ");
        employee.setPosition(scanner.nextLine());

        System.out.print("Enter salary: ");
        employee.setSalary(scanner.nextfloat());


        System.out.println("\nEmployee info:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Company: " + employee.companyName);


        human.introduce();
        student.introduce();
        employee.introduce();

        System.out.println(human.getRole());
        System.out.println(student.getRole());
        System.out.println(employee.getRole());

        scanner.close();
    }
}