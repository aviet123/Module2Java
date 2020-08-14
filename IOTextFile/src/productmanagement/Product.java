package productmanagement;

import java.io.Serializable;

public class Product implements Comparable<Product>, Serializable {
        private int id;
        private String name;
        private long price;
        private String brandName;
        private String otherInformation;


        public Product(int id, String name, long price, String brandName, String otherInformation) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.brandName = brandName;
            this.otherInformation = otherInformation;
        }

        public Product(int id, long price, String name, String brand, String information){

        }
        public Product(int id) {
            this.id = id;
        }

        public Product(int id, String name,long price) {
            this.id = id;
            this.price = price;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public long getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getOtherInformation() {
            return otherInformation;
        }

        public void setOtherInformation(String otherInformation) {
            this.otherInformation = otherInformation;
        }

        @Override
        public String toString() {
            return "Product_"+id+": {" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", brandName='" + brandName + '\'' +
                    ", otherInformation='" + otherInformation + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Product o) {
            if (this.getPrice() >= o.getPrice()) return 1;
            else return -1;
        }
    }
