package parking.staff;

public class Manager extends Staff {
    public Manager(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void showRole() {
        System.out.println("Security: " + name);
    }

    @Override
    public void work() {
        System.out.println("Security" + name + " chek the parking.");
    }

    @Override
    public double calculateSalary() {
        return salary * 1.2;
    }
}
