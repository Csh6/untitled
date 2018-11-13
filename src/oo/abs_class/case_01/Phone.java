package oo.abs_class.case_01;

import lombok.Data;

@Data
public class Phone  extends  Product{
    private  String cpu;
    private  double price;

    @Override
    public void detail(){
        System.out.println("小米5S");
    }
}
