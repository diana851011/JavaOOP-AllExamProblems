package onlineShop.models.products;

public class VideoCard extends BaseComponent{
    private static final double multiplier = 1.15;
    public VideoCard(int id, String manufacturer, String model, double price, double overallPerformance, int generation) {
        super(id, manufacturer, model, price, overallPerformance*multiplier, generation);
    }
}
