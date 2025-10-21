package parking.staff;

import parking.transport.Transport;

public class Driver extends Staff {
    private String licenseNumber;
    private Transport assignedTransport;

    public Driver(String name, int age, String licenseNumber) {
        super(name, age);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void showRole() {
        System.out.println("Driver: " + name + " (license " + licenseNumber + ")");
    }

    @Override
    public void work() {
        System.out.println("Driver " + name + " drives vehicles.");
    }

    @Override
    public double calculateSalary() {
        return salary + 500; // driver bonus
    }

    public void assignTransport(Transport t) {
        this.assignedTransport = t;
    }
}
