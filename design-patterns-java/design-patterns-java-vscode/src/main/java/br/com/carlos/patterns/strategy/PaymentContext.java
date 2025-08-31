package br.com.carlos.patterns.strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean pay(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de pagamento definida.");
        }
        System.out.println("[Context] Processando pagamento...");
        return strategy.pay(amount);
    }
}
