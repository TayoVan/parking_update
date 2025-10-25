
package parking.core;
import java.util.Scanner;

public class Manager {
    private Employee[] employees = new Employee[10];
    private int count = 0;

    public void addEmployee(Scanner sc) {
        if (count >= employees.length) {
            System.out.println("Не можна додати більше працівників!");
            return;
        }

        System.out.println("Виберіть кого додати: 1 - Cleaner, 2 - Security, 3 - Driver");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Введіть ім'я: ");
        String name = sc.nextLine();
        System.out.print("Введіть вік: ");
        int age = sc.nextInt();
        System.out.print("Введіть стаж: ");
        int exp = sc.nextInt();
        System.out.print("Введіть зарплату: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Employee emp = null;
        if (choice == 1) emp = new Cleaner(name, age, exp, salary);
        else if (choice == 2) emp = new Security(name, age, exp, salary);
        else if (choice == 3) {
            System.out.print("Введіть номер ліцензії: ");
            String license = sc.nextLine();
            emp = new Driver(name, age, exp, salary, license);
        } else {
            System.out.println("Невірний вибір!");
            return;
        }

        employees[count++] = emp;
        System.out.println("Працівника успішно додано!");
    }

    public void showEmployees() {
        if (count == 0) {
            System.out.println("Працівників немає!");
            return;
        }
        for (int i = 0; i < count; i++) {
            employees[i].displayInfo();
            employees[i].work();
            System.out.println();
        }
    }
}
