package org.example;

import shops.Product;
import shops.Shop;

import java.security.PublicKey;
import java.util.ArrayList;

public class Wife extends Customer {
    Husband husband = new Husband();
    private float allMoney = 0;
    private float testMoney = 200;


    private Product[] products = {};

    public Wife(){
        husband.getListOfAllProductsToWife();
        giveMeListOfAllProductsFromHusband();
        giveMeListOfAllProductsWithDiscountFromHusband();
        husband.whatWeCanBuy(testMoney);
        giveMeListOfProductsWeCanBuyFromList();
        printingLastMoneyAndProducts(husband.buyingProducts(DoingList(),countMoneyToSpend()));
    }

    public void giveMeListOfAllProductsFromHusband(){
        ArrayList<Product> products;
        ArrayList<Product> productsThatNeedToBuy = new ArrayList<>();
        products = husband.getBuyList();
        System.out.println("List of all products: ");
        for(Product product:products){
            System.out.println(product.getName() + " - " + product.getPrice());
        }

    }

    public void giveMeListOfAllProductsWithDiscountFromHusband(){
        ArrayList<Product> products = husband.getListOfAllProductsWithDiscountToWife();
        System.out.println("Products with discount: ");
        for(Product product : products){
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }


    public void giveMeListOfProductsWeCanBuyFromList(){
        ArrayList<Product> products = husband.getBuyList();
        System.out.println("We can buy: ");
        for (Product product:products){
            System.out.println(product.getName());
        }
    }

    public ArrayList<Product> DoingList(){
        ArrayList<Product> products = husband.getBuyList();
        ArrayList<Product> finalProduct = new ArrayList<>();
        System.out.println("Wife's list: ");
        int i = 0;
        for(Product product : products){
            if(i >= 2){
                break;
            }
            i++;
            finalProduct.add(new Product(product.getName(),product.getPrice()));
            System.out.println(product.getName());
        }
        return finalProduct;
    }

    public float countMoneyToSpend(){
        ArrayList<Product> products = husband.getBuyList();
        for(Product product:products){
            allMoney = allMoney + product.getPrice();
        }
        allMoney = testMoney;
        return allMoney;
    }

    public void printingLastMoneyAndProducts(float Totalmoney){
        float totalMoneyWithDiscount = husband.getTotalMoney();
        float moneyLeftWithout = 0;
        float moneyLeftWith = 0;
        ArrayList<Product> products = husband.getBuyList();
        System.out.println("Products bought: ");
        for (Product product:products){
            System.out.println(product.getName() + " - " + product.getPrice());
        }
        System.out.println("Total price without discount: " + Totalmoney);
        System.out.println("Total price with discount: " + totalMoneyWithDiscount);
        moneyLeftWithout = allMoney - Totalmoney;
        System.out.println("Money left without discount: " + moneyLeftWithout);
        moneyLeftWith = allMoney - totalMoneyWithDiscount;
        System.out.println("Money left with discount: " + moneyLeftWith);

    }


    }

