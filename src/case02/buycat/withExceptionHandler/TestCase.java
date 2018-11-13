package case02.buycat.withExceptionHandler;

import case02.buycat.withExceptionHandler.oo.Product;
import case02.buycat.withExceptionHandler.oo.Result;
import case02.buycat.withExceptionHandler.service.BuyService;

import java.math.BigDecimal;

public class TestCase {
    public static void main(String[] args) {

        Product p1 = new Product(1,"think what are you doin",null,new BigDecimal("99.00"));

        BuyService service = new BuyService();

        Result result = service.buy(p1,12);

        System.out.println(result);
    }
}
