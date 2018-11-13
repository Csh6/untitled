package case02.oo;

import lombok.Data;

@Data
public class Product implements Comparable{

    private  int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(){

    }
    public Product(int id,String name,double price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        Product p1 = this;
        Product p2 = (Product) o;

        if (p1.price < p2.price) return 1;
        else if (p1.price > p2.price) return -1;
        else  return 0;
    }
}
