package oo.inheritance.case_02;

import lombok.Data;

@Data
public class Product {
    protected   String name;
    protected   double price;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
    public void setPrice(){
        System.out.println(10.0);
    }
    public void setName(){
        System.out.println("Iphone X");
    }

}
