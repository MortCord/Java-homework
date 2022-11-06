package shops;

import java.util.ArrayList;

public class TechnicShop extends Shop {
    private Shop shop = new Discount();

    @Override
    public float getProductPrice(Product product){
        if(product.getName().equals("Sony") || product.getName().equals("Phone")){
            return shop.countDiscounts(product.getPrice()/2,true,product);

        }
        return product.getPrice();
    }
}
