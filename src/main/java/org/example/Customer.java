package org.example;

import shops.Product;

import java.util.ArrayList;

public class Customer {


   protected ArrayList<Product> buyList = new ArrayList<>();
   protected float totalMoney = 0;

   public ArrayList<Product> getBuyList(){
       return buyList;
   }

   public void setBuyList(ArrayList<Product> buyList){
       this.buyList = buyList;
   }

   public float getTotalMoney(){
       return totalMoney;
   }

   public void setTotalMoney(float totalMoney){
       this.totalMoney = totalMoney;
   }


}
