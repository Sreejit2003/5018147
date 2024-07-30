public class AdapterPatternTest {
    public static void main(String[] args) {
        // Using PayPal payment through the adapter
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor payPalProcessor = new PayPalPaymentAdapter(payPalPayment);
        payPalProcessor.processPayment(100.0);

        // Using Stripe payment through the adapter
        StripePayment stripePayment = new StripePayment();
        PaymentProcessor stripeProcessor = new StripePaymentAdapter(stripePayment);
        stripeProcessor.processPayment(200.0);

        // Using Square payment through the adapter
        SquarePayment squarePayment = new SquarePayment();
        PaymentProcessor squareProcessor = new SquarePaymentAdapter(squarePayment);
        squareProcessor.processPayment(300.0);
    }
}
