package br.com.carlos.patterns.strategy;

public class PixPayment implements PaymentStrategy {
    private final String pixKey;

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("[PIX] Enviando cobrança para a chave: " + pixKey + " no valor de R$ " + String.format("%.2f", amount));
        return true;
    }
}
