
package parking.core;

public class Parking {
    private ParkingSpot[] spots;

    public Parking(int size) {
        spots = new ParkingSpot[size];
        for (int i = 0; i < size; i++) {
            spots[i] = new ParkingSpot();
        }
    }

    public void addCar(String model, String number) {
        for (int i = 0; i < spots.length; i++) {
            if (!spots[i].isOccupied()) {
                spots[i].parkCar(model, number);
                return;
            }
        }
        System.out.println("Немає вільних місць!");
    }

    public void removeCar(int index, Payment payment) {
        if (index < 1 || index > spots.length) {
            System.out.println("Невірний номер місця!");
            return;
        }
        if (payment.isSuccess()) {
            spots[index - 1].removeCar();
        } else {
            System.out.println("Неможливо звільнити місце — оплата не проведена!");
        }
    }

    public void showStatus() {
        System.out.println("=== Стан паркінгу ===");
        for (int i = 0; i < spots.length; i++) {
            spots[i].displayInfo(i);
        }
    }
}
