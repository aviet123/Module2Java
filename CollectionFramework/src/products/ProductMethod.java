package products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductMethod {
    ArrayList<Product> list = new ArrayList<>();
    Product product = new Product();
    Scanner input = new Scanner(System.in);
    public void add(int id, long price, String name){
        list.add(new Product(id,price,name));
        Collections.sort(list);
    }
    public boolean remove(int id){
        for (Product product: list){
            if (id == product.getId()){
                return list.remove(product);
            }
        }
        return false;
    }
    public void showAll(){
        for (Product product: list){
            System.out.println(product.toString());
        }
    }
    public void searchProduct(String name){
        for (Product product: list){
            if (name.equals(product.getName())){
                System.out.println(product.toString());
            }
        }
    }
    public void updateProduct(int id){
        for (Product product: list){
            boolean findIdenticalID = product.getId() == id;
            if (findIdenticalID){
                System.out.println("Enter new name: ");
                String nameUpdated = input.nextLine();
                product.setName(nameUpdated);
                System.out.println("Enter new price: ");
                int priceUpdated = Integer.parseInt(input.nextLine());
                product.setPrice(priceUpdated);
            }
        }
    }
}
