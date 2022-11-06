package org.example;

import shops.Product;
import shops.ProductsShop;
import shops.Shop;
import shops.TechnicShop;

import java.util.ArrayList;


public class Husband extends Customer {
    private float money;
    Shop shop = new Shop() {
        @Override
        public ArrayList<Product> getAllProductsFromList() {
            return super.getAllProductsFromList();
        }
    };
    private ArrayList<Product> products;
    private ArrayList<Product> productsWithDiscount;
    private Shop prodShop = new ProductsShop();
    private Shop techShop = new TechnicShop();



    public Husband(){
        
    }

    public void setMoney(float money){
        this.money = money;
    }


    public void getListOfAllProductsToWife(){
        products = shop.getAllProductsFromList();
        setBuyList(products);
    }

    public ArrayList<Product> getListOfAllProductsWithDiscountToWife(){
        ArrayList<Product> products = shop.getAllProductsFromList();
        ArrayList<Product> productsWithDiscount = new ArrayList<>();
        for(Product product : products){
            productsWithDiscount.add(new Product(product.getName(), (product.getPrice() == prodShop.getProductPrice(product) ? techShop.getProductPrice(product) : prodShop.getProductPrice(product))));

        }
        this.productsWithDiscount = productsWithDiscount;
        return productsWithDiscount;
    }

    public void whatWeCanBuy(float testMoney){
        ArrayList<Product> productsThatNeedToBuy = new ArrayList<>();
        System.out.println("Wife said that she wanted to buy something for " + testMoney);
        for(Product product:products){
            if(testMoney > product.getPrice()){
                testMoney = testMoney - product.getPrice();
                productsThatNeedToBuy.add(new Product(product.getName(),product.getPrice()));
            }else{
                continue;
            }
        }
        setBuyList(productsThatNeedToBuy);
    }

    public float buyingProducts(final ArrayList<Product> products,float money){
        ArrayList<Product> productsDiscount = new ArrayList<>();
        float moneyForDiscount = money;
        float totalMoney = 0;
        float totalMoneyWithDiscount = 0;
        for (Product product:products){
            money = money - product.getPrice();
            totalMoney = totalMoney + product.getPrice();
        }
        for (Product product : products) {
            for (Product product1 : productsWithDiscount) {
                if(product.getName().equals(product1.getName())){
                    productsDiscount.add(new Product(product.getName(),product1.getPrice()));
                }
            }
        }


        for(Product product : productsDiscount){
            moneyForDiscount = moneyForDiscount - product.getPrice();
            totalMoneyWithDiscount = totalMoneyWithDiscount + product.getPrice();
        }

        setBuyList(products);
        setTotalMoney(totalMoneyWithDiscount);
        return totalMoney;

    }







}
