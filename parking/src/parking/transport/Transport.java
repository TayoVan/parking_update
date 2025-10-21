package parking.transport;

public class Transport {
    protected String carModel;
    protected String carGovNumber;
    protected String enterDate;

    public Transport(String carModel, String carGovNumber, String enterDate) {
        this.carModel = carModel;
        this.carGovNumber = carGovNumber;
        this.enterDate = enterDate;
    }

    public void showInfo() {
        System.out.println("Transport: " + carModel + " (" + carGovNumber + ") entered at " + enterDate);
    }

    public String getCarGovNumber() {
        return carGovNumber;
    }
}
