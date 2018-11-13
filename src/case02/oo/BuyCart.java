package case02.oo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BuyCart {
//    public BuyCart(List<Item> items) {
//        this.items = items;
//    }

    private List<Item> items =new ArrayList();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        if (items.contains(item)){
            for (Item i : items){
                if (i.equals(item)){
                    i.setAmount(i.getAmount()+item.getAmount());
                }
            }
        }else {
            items.add(item);
        }
    }
    //显示购物车
    public  void showBuyCart(){
        for (Item item : items){
            System.out.println(item);
        }
    }
}
