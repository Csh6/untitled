package Test.Case_1;

import lombok.Data;

@Data
public  abstract  class Product {
    private String name;
    private  double price;

    public abstract  void  detail();


}



