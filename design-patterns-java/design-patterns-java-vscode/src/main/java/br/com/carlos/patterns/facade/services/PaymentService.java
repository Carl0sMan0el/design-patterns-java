package br.com.carlos.patterns.facade.services;

import br.com.carlos.patterns.strategy.PaymentStrategy;

public class PaymentService {
    public boolean charge(double amount, PaymentStrategy strategy) {
        System.out.println("[Pagamentos] Encaminhando cobrança...");
        return strategy.pay(amount);
    }
}
