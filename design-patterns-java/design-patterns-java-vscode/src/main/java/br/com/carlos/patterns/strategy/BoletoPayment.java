package br.com.carlos.patterns.strategy;

public class BoletoPayment implements PaymentStrategy {
    private final String linhaDigitavel;

    public BoletoPayment(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("[Boleto] Gerando boleto (" + linhaDigitavel + ") no valor de R$ " + String.format("%.2f", amount));
        return true;
    }
}
