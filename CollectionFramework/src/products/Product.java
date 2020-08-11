package products;


public class Product implements Comparable<Product> {
    private int id;
    private long price;
    private String name;

    public Product(){
        
    }
    public Product(int id) {
        this.id = id;
    }

    public Product(int id, long price, String name) {
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


    @Override
    public String toString() {
        return "Product "+id+"{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.getPrice() >= o.getPrice()) return 1;
        else return -1;
    }
}
