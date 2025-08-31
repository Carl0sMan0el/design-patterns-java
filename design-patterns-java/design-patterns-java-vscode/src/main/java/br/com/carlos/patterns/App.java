package br.com.carlos.patterns;

import br.com.carlos.patterns.singleton.ConfigManager;
import br.com.carlos.patterns.strategy.*;
import br.com.carlos.patterns.facade.OrderFacade;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Demo: Singleton ===");
        ConfigManager cfg = ConfigManager.getInstance();
        cfg.set("env", "dev");
        cfg.set("featureX.enabled", "true");
        System.out.println("Config env  => " + cfg.get("env"));
        System.out.println("Feature X   => " + cfg.get("featureX.enabled"));

        System.out.println("\n=== Demo: Strategy ===");
        PaymentContext context = new PaymentContext(new PixPayment("chave-pix-aleatoria"));
        context.pay(149.90);
        context.setStrategy(new CreditCardPayment("JOAO SILVA", "4111111111111111", "12/29"));
        context.pay(299.00);
        context.setStrategy(new BoletoPayment("23790.12345 60000.000000 00000.000000 1 23450000010000"));
        context.pay(1000.00);

        System.out.println("\n=== Demo: Facade ===");
        OrderFacade facade = new OrderFacade();
        PaymentStrategy strategy = new PixPayment("chave-pix-loja");
        boolean ok = facade.placeOrder("SKU-ABC-123", 2, 499.90, strategy);
        System.out.println("Pedido concluído? " + ok);
    }
}
