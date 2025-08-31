package br.com.carlos.patterns.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private final String holder;
    private final String number;
    private final String exp;

    public CreditCardPayment(String holder, String number, String exp) {
        this.holder = holder;
        this.number = number;
        this.exp = exp;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("[Cartão] Autorizando compra de R$ " + String.format("%.2f", amount) + " para " + holder);
        return true;
    }
}
