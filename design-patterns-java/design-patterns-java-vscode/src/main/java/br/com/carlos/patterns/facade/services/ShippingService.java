package br.com.carlos.patterns.facade.services;

import java.util.UUID;

public class ShippingService {
    public String ship(String sku, int qty) {
        System.out.println("[Entrega] Preparando envio do item " + sku + " (qtd: " + qty + ")");
        return "BR-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
