
package parking.core;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть кількість місць на паркінгу: ");
        int size = sc.nextInt();
        sc.nextLine();

        Parking parking = new Parking(size);
        Manager manager = new Manager();
        Payment payment = new Payment();

        while (true) {
            System.out.println("\n=== MENU PARKOVKA ===");
            System.out.println("1. Додати бібіку");
            System.out.println("2. Звільнити місце (після оплати)");
            System.out.println("3. Додати працівника");
            System.out.println("4. Провести оплату");
            System.out.println("5. Показати стан паркінгу");
            System.out.println("6. Показати працівників та їх зарплату");
            System.out.println("0. Вихід");
            System.out.print("Ваш вибір: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введіть модель авто: ");
                    String model = sc.nextLine();
                    System.out.print("Введіть номер авто: ");
                    String number = sc.nextLine();
                    parking.addCar(model, number);
                    break;
                case 2:
                    System.out.print("Введіть номер місця для звільнення: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    parking.removeCar(index, payment);
                    break;
                case 3:
                    manager.addEmployee(sc);
                    break;
                case 4:
                    payment.makePayment(sc);
                    break;
                case 5:
                    parking.showStatus();
                    break;
                case 6:
                    manager.showEmployees();
                    break;
                case 0:
                    System.out.println("Вихід із програми...");
                    sc.close();
                    return;
                default:
                    System.out.println("Невірний вибір!");
            }
        }
    }
}
