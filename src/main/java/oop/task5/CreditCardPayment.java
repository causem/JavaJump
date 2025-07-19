package oop.task5;

public class CreditCardPayment extends Payment{

    @Override
    void processPayment() {
        System.out.println("Payment by Credit Card");
    }
}
