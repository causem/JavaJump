package oop.task5;

public class PaypalPayment extends Payment{
    @Override
    void processPayment() {
        System.out.println("Payment by PayPal");
    }
}
