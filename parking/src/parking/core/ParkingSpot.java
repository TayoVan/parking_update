package parking.core;

import parking.transport.Transport;

public class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Transport parkedCar;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
    }

    public boolean isFree() {
        return !isOccupied;
    }

    public void parkCar(Transport car) {
        if (!isOccupied) {
            this.parkedCar = car;
            this.isOccupied = true;
            System.out.println("Місце №" + spotNumber + " зайнято авто " + car.getCarGovNumber());
        } else {
            System.out.println("Місце №" + spotNumber + " вже зайняте!");
        }
    }

    public void removeCar() {
        if (isOccupied) {
            System.out.println("Місце №" + spotNumber + " звільнено (авто " + parkedCar.getCarGovNumber() + ")");
            this.parkedCar = null;
            this.isOccupied = false;
        } else {
            System.out.println("Місце №" + spotNumber + " вже вільне.");
        }
    }

    public void showInfo() {
        if (isOccupied) {
            System.out.println("Місце №" + spotNumber + ": зайняте авто " + parkedCar.getCarGovNumber());
        } else {
            System.out.println("Місце №" + spotNumber + ": вільне");
        }
    }

    public Transport getParkedCar() {
        return parkedCar;
    }
}
