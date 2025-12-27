package app;

public final class Student extends Human implements ILearner {
    private final String university;
    private float gpa;

    public Student(String name, int age, boolean male, String university, float gpa){
       super(name, age, male);
       this.university = university;
       this.gpa = gpa;
    }

    public final void showUniversity(){
        System.out.println("University: " + university);
    }

    @Override
    public String getRole(){
        return "Student";
    }

    @Override
    public void study(){
        System.out.println(name + " is studying at university");
    }

    @Override
    public void takeExam(){
        System.out.println(name + " is taking an exam");
    }
}
