package onlineShop.models.products;

import onlineShop.models.products.BaseComponent;

public class CentralProcessingUnit extends BaseComponent {
    private static final double multiplier = 1.25;
    public CentralProcessingUnit(int id, String manufacturer, String model, double price, double overallPerformance, int generation) {
        super(id, manufacturer, model, price, overallPerformance *multiplier, generation);
    }
}
