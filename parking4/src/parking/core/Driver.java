
package parking.core;

public class Driver extends Employee {
    private String license;

    public Driver(String name, int age, int experience, double salary, String license) {
        super(name, age, experience, salary);
        this.license = license;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Driver Info ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience + " years");
        System.out.println("License: " + license);
        System.out.println("Salary: " + salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is driving vehicles inside the parking area.");
    }
}
