package products;

import java.util.*;

public class ProductManager {
    public static void main(String[] args) throws Exception {
        ProductMethod method = new ProductMethod();
        int choice=-1;
        while (choice!= 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Remove");
            System.out.println("4. Show");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập price: ");
                    long price = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập tên product: ");
                    String name = scanner.nextLine();
                    method.add(id,price,name);
                    break;
                case 2:
                    System.out.println("nhập idchange: ");
                    int idChange = Integer.parseInt(scanner.nextLine());
                    method.updateProduct(idChange);
                    break;
                case 3:
                    System.out.println("nhập id: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    method.remove(id1);
                    break;
                case 4:
                    method.showAll();
                    break;
                case 5:
                    System.out.println("nhập tên: ");
                    String nameProduct = scanner.nextLine();
                    method.searchProduct(nameProduct);
                    break;
                case 6:
                    System.exit(0);
                default:
                    throw new Exception("product can not be found!! ");
            }
        }
    }
}
