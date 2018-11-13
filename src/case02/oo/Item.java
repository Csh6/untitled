package case02.oo;

import case02.buycat.withExceptionHandler.oo.Product;
import lombok.Data;

import java.util.Objects;

@Data
public class Item {

    private Product product;
    private Integer amount;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Item(Product product, Integer amount){
        this.amount = amount;
        this.product = product;
    }

    @Override
    public boolean equals(Object obj) {
        Item item1 = this;
        Item item2 = (Item) obj;

        if (item1.getProduct().getId() == item2.getProduct().getId()){
            return  true;
        }else {
            return false;
        }
    }



}
