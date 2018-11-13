package Test.Case_1;

import lombok.Data;

@Data
public class Phone extends Product {
    private String cpu;
    private String memory;

    @Override
    public void detail() {
        System.out.println("一部手机");
    }
}
