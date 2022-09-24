package shops;

import java.util.ArrayList;

public class Discount extends Shop {
    protected ArrayList<Float> discounts = new ArrayList<Float>();





    @Override
    public float countDiscounts(float discount, boolean isTrue, Product product) {
        if (isTrue) {
            discounts.add(discount);
            return discount;
        }
        return product.getPrice();
    }
}
