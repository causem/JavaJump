package oop.task5;

public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        creditCard.processPayment();
        Payment paypal = new PaypalPayment();
        paypal.processPayment();


    }
}
