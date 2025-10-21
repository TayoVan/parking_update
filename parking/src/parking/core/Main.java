package parking.core;

import parking.transport.*;
import parking.staff.*;
import parking.payment.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CCTV PROGRAMATOR PARKOVKA ===");
        System.out.print("Введіть кількість місць на паркінгу: ");
        int capacity = Integer.parseInt(sc.nextLine());
        Parking parking = new Parking(capacity);

        List<Transport> transports = new ArrayList<>();
        List<Staff> staffList = new ArrayList<>();
        List<PaymentCheck> payments = new ArrayList<>();

        while (true) {
            System.out.println("\n=== MENU PARKOVKA ===");
            System.out.println("1. Додати Бібіку");
            System.out.println("2. Звільнити місце (бібіка виїжджає)");
            System.out.println("3. Додати працівника");
            System.out.println("4. Провести оплату");
            System.out.println("5. Показати стан паркінгу");
            System.out.println("6. Показати працівників та їх зарплату");
            System.out.println("0. Вихід");
            System.out.print("Ваш вибір: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Невірний ввід, спробуйте ще раз.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Введіть модель авто: ");
                    String model = sc.nextLine();
                    System.out.print("Введіть номер авто: ");
                    String number = sc.nextLine();
                    System.out.print("Введіть дату в'їзду: ");
                    String date = sc.nextLine();
                    Car car = new Car(model, number, date);
                    transports.add(car);
                    parking.parkCar(car);
                    break;

                case 2:
                    System.out.print("Введіть номер авто для виїзду: ");
                    String numToRemove = sc.nextLine();
                    parking.unparkCar(numToRemove);
                    break;

                case 3:
                    System.out.print("1 - Водій, 2 - Працівник: ");
                    int type = Integer.parseInt(sc.nextLine());
                    System.out.print("Ім'я: ");
                    String name = sc.nextLine();
                    System.out.print("Вік: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Зарплата : ");
                    double salary = Double.parseDouble(sc.nextLine());

                    if (type == 1) {
                        System.out.print("Номер ліцензії: ");
                        String license = sc.nextLine();
                        Driver d = new Driver(name, age, license);
                        d.setSalary(salary);
                        staffList.add(d);
                    } else {
                        Manager m = new Manager(name, age, salary);
                        staffList.add(m);
                    }
                    System.out.println("Працівника додано.");
                    break;

                case 4:
                    System.out.print("1 - Готівка, 2 - Картка: ");
                    int payType = Integer.parseInt(sc.nextLine());
                    PaymentCheck payment;
                    if (payType == 1) {
                        System.out.print("Введіть суму: ");
                        double sum = Double.parseDouble(sc.nextLine());
                        payment = new CashPayment(payments.size() + 1, sum);
                    } else {
                        System.out.print("Введіть номер картки: ");
                        String card = sc.nextLine();
                        payment = new CardPayment(payments.size() + 1, card);
                    }
                    payment.processPayment();
                    payments.add(payment);
                    break;

                case 5:
                    parking.showStatus();
                    break;

                case 6:
                    System.out.println("\n--- RABOTNICHKI ---");
                    for (Staff s : staffList) {
                        s.showRole();
                        System.out.println("Salary : " + s.getSalary() + " | Calculated: " + s.calculateSalary());
                        s.work();
                    }
                    break;

                case 0:
                    System.out.println("До побачення!");
                    sc.close();
                    return;

                default:
                    System.out.println("Невірний вибір, спробуйте ще раз.");
            }
        }
    }
}
