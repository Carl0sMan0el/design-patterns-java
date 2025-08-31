package br.com.carlos.patterns.facade.services;

public class InventoryService {
    public boolean checkStock(String sku, int qty) {
        System.out.println("[Estoque] Verificando item " + sku + " (qtd: " + qty + ")");
        return true;
    }
}
