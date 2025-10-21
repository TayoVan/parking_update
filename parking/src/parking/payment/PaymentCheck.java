package parking.payment;

public class PaymentCheck {
    protected int id;
    protected boolean isPaid;

    public PaymentCheck(int id) {
        this.id = id;
        this.isPaid = false;
    }

    public void processPayment() {
        System.out.println("PaymentCheck.processPayment(): base implementation");
        this.isPaid = true;
    }

    public void printInfo() {
        System.out.println("Payment ID: " + id + " | Status: " + (isPaid ? "PAID" : "NOT PAID"));
    }
}
