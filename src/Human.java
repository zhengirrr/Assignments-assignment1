package app;

public class Human {
    private int age;
    private String name;
    private boolean male;

    public Human(int age, String name, boolean male){
        this.age = age;
        this.name = name;
        this.male = male;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public boolean getMale() {
        return male;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMale(boolean male) {
        this.male = male;
    }
    public void introduce(){
        System.out.print("Hello my name is" + name + ".");
    }
    public String getRole(){
        return "Human";
    }
}