package Test.Case_1;

import lombok.Data;

@Data
public class Book extends  Product{
    private  String author;
    private String ishn;

    @Override
    public void detail() {
        System.out.println("一本书的详情");
    }
}
