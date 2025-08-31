package br.com.carlos.patterns.strategy;

public interface PaymentStrategy {
    boolean pay(double amount);
}
