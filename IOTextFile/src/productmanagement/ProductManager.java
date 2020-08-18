package productmanagement;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
        public static void main(String[] args) {
            ArrayList<Product> list = new ArrayList<>();
            ProductController controller = new ProductController();
            int choice;
            while (true){
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
                            System.out.println("nhập tên brand: ");
                            String brand = scanner.nextLine();
                            System.out.println("nhập product Information: ");
                            String informationPr = scanner.nextLine();
                            controller.add(id,price,name,brand,informationPr,list);
                            break;
                        case 2:
                            System.out.println("nhập id cần update: ");
                            int id2 = Integer.parseInt(scanner.nextLine());
                            controller.updateProduct(id2,list);

                        case 3:
                            System.out.println("nhập id: ");
                            int id1 = Integer.parseInt(scanner.nextLine());
                            controller.remove(id1,list);
                            break;
                        case 4:
                            controller.showAll(list);
                            readProduct(list);
                            break;
                        case 5:
                            System.out.println("nhập tên: ");
                            String nameProduct = scanner.nextLine();
                            controller.searchProduct(nameProduct,list);
                            writeSearchingToFile(list,nameProduct);
                            break;
                        case 6:
                            writeProductToFile(list);
                            readProduct(list);
                            return;
                    }
                }
            }

        public static void writeProductToFile(ArrayList<Product> array){
            String filename = "D:/Count.txt";
            File source = new File(filename);

            try {
                FileOutputStream ops = new FileOutputStream(source,false);
                ObjectOutputStream obs = new ObjectOutputStream(ops);
                for (Product product: array){
                    obs.writeObject(product);
                }
                obs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void readProduct(ArrayList<Product> array){
            String filename = "D:/Count.txt";
            File source = new File(filename);

            try {
                FileInputStream ips = new FileInputStream(source);
                ObjectInputStream ois = new ObjectInputStream(ips);
                int i = 0;
                while (i < array.size()) {
                    Product product = (Product) ois.readObject();
                    System.out.println(product);
                    i++;
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    public static void writeSearchingToFile(ArrayList<Product> array,String nameProduct){
        String filename = "D:/Target.txt";
        File source = new File(filename);
        try {
            FileOutputStream ops = new FileOutputStream(source,false);
            ObjectOutputStream obs = new ObjectOutputStream(ops);
            for (Product product: array){
                if (product.getName().equals(nameProduct))
                obs.writeObject(product);
            }
            obs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

