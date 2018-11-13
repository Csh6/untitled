package case02.buycat.withExceptionHandler.service;

import case02.buycat.withExceptionHandler.exception.LowStockException;
import case02.buycat.withExceptionHandler.handler.ResultBuilder;
import case02.buycat.withExceptionHandler.oo.Product;
import case02.buycat.withExceptionHandler.oo.Result;
import case02.buycat.withExceptionHandler.type.ResultEnum;
import javafx.fxml.LoadException;

public class BuyService {
    //库存
    public static final Integer storage = 10;
    public Result buy(Product product,int amount){
        try {
            if (storage - amount >=0){
                Result result = ResultBuilder.success(product);
                return  result;
            }
            else if (storage - amount <0){
                throw new LowStockException(ResultEnum.ERROR_LOWSTOCK);
            }
        }catch (LowStockException e){
            Result result = ResultBuilder.error(e.getCode(),e.getMessage());
            return result;
        }
        return  null;
    }
}
