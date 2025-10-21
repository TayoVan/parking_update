package parking.payment;

public class CashPayment extends PaymentCheck {
    private double sum;

    public CashPayment(int id, double sum) {
        super(id);
        this.sum = sum;
    }

    @Override
    public void processPayment() {
        isPaid = true;
        System.out.println("Cash payment: " + sum + " UAH");
    }
}
