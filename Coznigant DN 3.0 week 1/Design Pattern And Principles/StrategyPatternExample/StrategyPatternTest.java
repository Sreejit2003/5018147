public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Use Credit Card Payment
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        paymentContext.setPaymentStrategy(creditCard);
        paymentContext.executePayment(250.00);

        // Use PayPal Payment
        PaymentStrategy payPal = new PayPalPayment("user@example.com");
        paymentContext.setPaymentStrategy(payPal);
        paymentContext.executePayment(150.00);
    }
}
