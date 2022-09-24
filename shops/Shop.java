package shops;

import java.util.ArrayList;

public abstract class Shop {

    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Product> productsWithDiscount = new ArrayList<>();
//    protected ArrayList<Float> discounts = new ArrayList<Float>();

    public Shop(){
        products.add(new Product("Sony", 100f));
        products.add(new Product("Apple", 50f));
        products.add(new Product("Phone",300f));
        products.add(new Product("Bubble gum",20f));
        products.add(new Product("Roshen",50f));

    }

//    public float getProductPrice(String productName){
//        //write your code here
//
//        return 0;
//    }

    public float getProductPrice(Product product){

    return 0;
    }

//    public float getDiscounts(){
//
//        return 0;
//    }

    public float countDiscounts(float discount, boolean isTrue, Product product){
        ArrayList<Float> floats = new ArrayList<>();

        return discount;

    }

    public ArrayList<Product> getAllProductsFromList(){
        return products;
    }

    public ArrayList<Product> getAllProductsWithDiscountFromList(){
        return productsWithDiscount;
    }



}
