package parking.payment;

public class CardPayment extends PaymentCheck {
    private String cardNumber;

    public CardPayment(int id, String cardNumber) {
        super(id);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        isPaid = true;
        String tail = cardNumber.length() >= 4 ? cardNumber.substring(cardNumber.length()-4) : cardNumber;
        System.out.println("Card payment: ****" + tail);
    }
}
