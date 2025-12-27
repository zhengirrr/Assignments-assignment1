package app;;

public class Main{
    public static void main(String[] args){
        Human humanEmp = new Employee("Miwa",23, false, "Designer", 56000);
        Human humanStu = new Student("Amy",19, false, "Aitu", 3.1f);

        IWorker worker = new Employee("Aki",23, true, "Developer", 70000);
        ILearner learner = new Student("Ulpan",19, false, "Aitu", 3.0f);

        Employee employee = new Employee("Moris",26, true, "Artist", 45000);
        Student student = new Student("Dipper",19, true, "Aitu", 3.5f);

        humanEmp.introduce();
        System.out.println(humanEmp.getRole());

        humanStu.introduce();
        System.out.println(humanStu.getRole());

        worker.work();
        worker.getSalaryInfo();

        learner.study();
        learner.takeExam();

        employee.study();
        employee.takeExam();

        student.showUniversity();
        student.study();
    }
}
