
package parking.core;

public class Cleaner extends Employee {
    public Cleaner(String name, int age, int experience, double salary) {
        super(name, age, experience, salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Cleaner Info ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: " + salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is cleaning the parking area.");
    }
}
