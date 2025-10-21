package parking.transport;

public class Car extends Transport {
    public Car(String carModel, String carGovNumber, String enterDate) {
        super(carModel, carGovNumber, enterDate);
    }

    @Override
    public void showInfo() {
        System.out.println("Car: " + carModel + " (" + carGovNumber + "), entered: " + enterDate);
    }
}
