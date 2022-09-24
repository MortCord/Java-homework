package shops;

import java.util.ArrayList;

public class ProductsShop extends Shop{
    private Shop shop = new Discount();

    @Override
    public float getProductPrice(Product product){
        if(product.getName().equals("Roshen") || product.getName().equals("Apple")){
            return shop.countDiscounts(product.getPrice()/2,true,product);

        }
        return product.getPrice();
    }
}
