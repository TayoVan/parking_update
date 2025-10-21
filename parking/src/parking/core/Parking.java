package parking.core;

import parking.transport.Transport;

public class Parking {
    private ParkingSpot[] spots;

    public Parking(int capacity) {
        if (capacity < 1) capacity = 1;
        spots = new ParkingSpot[capacity];
        for (int i = 0; i < capacity; i++) {
            spots[i] = new ParkingSpot(i + 1);
        }
    }

    public ParkingSpot findFreeSpot() {
        for (ParkingSpot s : spots) {
            if (s.isFree()) return s;
        }
        return null;
    }

    public void parkCar(Transport car) {
        ParkingSpot free = findFreeSpot();
        if (free != null) {
            free.parkCar(car);
        } else {
            System.out.println("Немає вільних місць для " + car.getCarGovNumber());
        }
    }

    public void unparkCar(String carNumber) {
        for (ParkingSpot s : spots) {
            if (!s.isFree() && s.getParkedCar().getCarGovNumber().equalsIgnoreCase(carNumber)) {
                s.removeCar();
                return;
            }
        }
        System.out.println("Автомобіль з номером " + carNumber + " не знайдено на паркінгу.");
    }

    public void showStatus() {
        System.out.println("\n=== СТАН ПАРКІНГУ ===");
        for (ParkingSpot s : spots) s.showInfo();
    }
}
