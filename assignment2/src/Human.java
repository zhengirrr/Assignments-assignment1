package app;

public abstract class Human {
    protected String name;
    protected int age;
    protected boolean male;

    public Human(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public abstract String getRole();

    public void introduce(){
        System.out.println("Hello my name is " + name);
    }
}
