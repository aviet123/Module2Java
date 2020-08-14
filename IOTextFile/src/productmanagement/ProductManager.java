package productmanagement;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
        public static void main(String[] args) throws Exception {
            ArrayList<Product> list = new ArrayList<>();
            int choice=-1;
            while (choice!= 0){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Menu");
                System.out.println("1. Add");
                System.out.println("2. Remove");
                System.out.println("3. Show");
                System.out.println("4. Search");
                System.out.println("5. Exit");
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
                        list.add(new Product(id,name,price,brand,informationPr));
                        break;
                    case 2:
                        System.out.println("nhập id: ");
                        int id1 = Integer.parseInt(scanner.nextLine());
                        for (Product product: list){
                            if (product.getId()==id1){
                                list.remove(product);
                                return;
                            }
                        }
                        break;
                    case 3:
                        for (Product product: list){
                                System.out.println(product.toString());
                            }
                        break;
                    case 4:
                        System.out.println("nhập tên: ");
                        String nameProduct = scanner.nextLine();
                        for (Product product: list){
                        if (nameProduct.equals(product.getName())){
                                System.out.println(product.toString());
                            }
                         }
                        writeSearchingToFile(list,nameProduct);
                        break;
                    case 5:
                        writeProductToFile(list);
                        readProduct(list);
                        return;
                    default:
                        throw new Exception("product can not be found!! ");
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

