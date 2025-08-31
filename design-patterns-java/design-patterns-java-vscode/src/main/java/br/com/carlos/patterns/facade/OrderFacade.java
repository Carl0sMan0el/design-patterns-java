package br.com.carlos.patterns.facade;

import br.com.carlos.patterns.strategy.PaymentStrategy;
import br.com.carlos.patterns.facade.services.InventoryService;
import br.com.carlos.patterns.facade.services.PaymentService;
import br.com.carlos.patterns.facade.services.ShippingService;

public class OrderFacade {
    private final InventoryService inventory = new InventoryService();
    private final PaymentService payments = new PaymentService();
    private final ShippingService shipping = new ShippingService();

    public boolean placeOrder(String sku, int qty, double amount, PaymentStrategy strategy) {
        System.out.println("[Facade] Iniciando fluxo de pedido...");
        if (!inventory.checkStock(sku, qty)) {
            System.out.println("[Facade] Falha: sem estoque.");
            return false;
        }
        if (!payments.charge(amount, strategy)) {
            System.out.println("[Facade] Falha: pagamento recusado.");
            return false;
        }
        String tracking = shipping.ship(sku, qty);
        System.out.println("[Facade] Pedido enviado! Rastreamento: " + tracking);
        return true;
    }
}
