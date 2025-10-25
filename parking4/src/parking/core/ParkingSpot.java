
package parking.core;

public class ParkingSpot {
    private boolean occupied;
    private String carModel;
    private String carNumber;

    public boolean isOccupied() {
        return occupied;
    }

    public void parkCar(String model, String number) {
        if (occupied) {
            System.out.println("Місце вже зайняте!");
        } else {
            this.carModel = model;
            this.carNumber = number;
            this.occupied = true;
            System.out.println("Машину припарковано: " + model + " (" + number + ")");
        }
    }

    public void removeCar() {
        if (!occupied) {
            System.out.println("Місце вже вільне.");
        } else {
            System.out.println("Машина " + carModel + " (" + carNumber + ") виїхала.");
            this.occupied = false;
            this.carModel = null;
            this.carNumber = null;
        }
    }

    public void displayInfo(int index) {
        System.out.println("Місце " + (index + 1) + ": " + (occupied ? "зайняте (" + carModel + ", " + carNumber + ")" : "вільне"));
    }
}
