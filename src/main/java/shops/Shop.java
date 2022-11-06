package shops;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.sql.Connection;

public abstract class Shop {

    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Product> productsWithDiscount = new ArrayList<>();
//    protected ArrayList<Float> discounts = new ArrayList<Float>();



    public Shop(){
//        products.add(new Product("Sony", 100f));
//        products.add(new Product("Apple", 50f));
//        products.add(new Product("Phone",300f));
//        products.add(new Product("Bubble gum",20f));
//        products.add(new Product("Roshen",50f));
//            File file = new File("C:\\Users\\ratyn\\Desktop\\Shop_alt_version\\src\\shops\\products.txt");
//            try(FileReader reader = new FileReader(file)){
//                Scanner scan = new Scanner(reader);
//                while(scan.hasNextLine()){
//                    String line = scan.nextLine();
//                    String[] productAndPrice = line.split(" ");
//                    String product = productAndPrice[0];
//                    int price = Integer.parseInt(productAndPrice[1]);
//                    products.add(new Product(product, price));
//                }
//            }
//            catch(IOException ex) {
//                System.out.println("error" + ex);
//            }

        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/menagerie","root","77551188@gmsql");
            Statement state = conn.createStatement();
            ResultSet resProd = state.executeQuery("SELECT * FROM menagerie.shop;");

            while(resProd.next()){
                products.add(new Product(resProd.getString(2),resProd.getFloat(3)));
            }

        }catch(SQLException e){
            System.out.println(e);
        }

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
