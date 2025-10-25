
package parking.core;
import java.util.Scanner;

public class Payment {
    private String method;
    private boolean success;

    public void makePayment(Scanner sc) {
        System.out.println("Оберіть метод оплати: 1 - готівка, 2 - картка");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) method = "Готівка";
        else if (choice == 2) method = "Картка";
        else {
            System.out.println("Невірний вибір методу оплати!");
            return;
        }

        System.out.print("Оплата пройшла успішно? (так/ні): ");
        String answer = sc.nextLine();
        success = answer.equalsIgnoreCase("так");

        if (success)
            System.out.println("Оплату " + method + " проведено успішно!");
        else
            System.out.println("Оплату не проведено!");
    }

    public boolean isSuccess() {
        return success;
    }
}
