package onlineShop.models.products;

public class Motherboard extends BaseComponent{
    private static final double multiplier = 1.25;
    public Motherboard(int id, String manufacturer, String model, double price, double overallPerformance, int generation) {
        super(id, manufacturer, model, price, overallPerformance*multiplier, generation);
    }
}
