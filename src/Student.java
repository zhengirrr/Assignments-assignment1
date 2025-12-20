package app;

public class Student extends Human{
    private String specialities;
    private float grade;

    public Student(int age, String name, boolean isMale, String specialities, float grade){
        super(age, name, isMale);
        this.specialities = specialities;
        this.grade = grade;
    }
    public String getSpecialities() {
        return specialities;
    }
    public Float getGrade() {
        return grade;
    }
    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }
    public void setGrade(Float grade) {
        this.grade = grade;
    }
    public void setMale(boolean male) {
    }
    @Override
    public String getRole(){
        return "Student";
    }
}
