
package parking.core;

public abstract class Employee {
    protected String name;
    protected int age;
    protected int experience;
    protected double salary;

    public Employee(String name, int age, int experience, double salary) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
    }

    public abstract void displayInfo();
    public abstract void work();
}
