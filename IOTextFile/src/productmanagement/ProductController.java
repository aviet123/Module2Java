package productmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductController  {
    Scanner input = new Scanner(System.in);
    public void add(int id, long price, String name, String brand, String information,ArrayList<Product> list){
        list.add(new Product(id,name,price,brand,information));
        Collections.sort(list);
    }
    public void remove(int id, ArrayList<Product> list){
        for (Product product: list){
            if (id == product.getId()){
                list.remove(product);
                return;
            }
        }
    }
    public void showAll(ArrayList<Product> list){
        for (Product product: list){
            System.out.println(product.toString());
        }
    }
    public void searchProduct(String name,ArrayList<Product> list){
        for (Product product: list){
            if (name.equals(product.getName())){
                System.out.println(product.toString());
            }
        }
    }
    public void updateProduct(int id,ArrayList<Product> list){
        for (Product product: list){
            boolean findIdenticalID = product.getId() == id;
            if (findIdenticalID){
                System.out.println("Enter new name: ");
                String nameUpdated = input.nextLine();
                product.setName(nameUpdated);
                System.out.println("Enter new price: ");
                int priceUpdated = Integer.parseInt(input.nextLine());
                product.setPrice(priceUpdated);
                System.out.println("Enter new name: ");
                String brandUpdated = input.nextLine();
                product.setBrandName(brandUpdated);
                System.out.println("Enter new name: ");
                String inforUpdated = input.nextLine();
                product.setOtherInformation(inforUpdated);
            }
        }
    }
}
