package parking.core;

public class Employee {
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

    public void displayInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Стаж: " + experience + " років");
        System.out.println("Зарплата: " + salary);
    }

    public void work() {
        System.out.println(name + " виконує роботу співробітника паркінгу.");
    }
}
