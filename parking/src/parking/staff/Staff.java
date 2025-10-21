package parking.staff;

public class Staff {
    protected String name;
    protected int age;
    protected double salary;

    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showRole() {
        System.out.println("Staff: " + name);
    }

    public void work() {
        System.out.println("Staff.work(): " + name + " is working (base).");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}
