package parking.transport;

public class Truck extends Transport {
    private double maxLoadTons;

    public Truck(String carModel, String carGovNumber, String enterDate, double maxLoadTons) {
        super(carModel, carGovNumber, enterDate);
        this.maxLoadTons = maxLoadTons;
    }

    @Override
    public void showInfo() {
        System.out.println("Truck: " + carModel + " (" + carGovNumber + "), load: " + maxLoadTons + " t");
    }
}
