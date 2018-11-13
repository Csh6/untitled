package case02.buycat.withExceptionHandler.handler;

import case02.buycat.withExceptionHandler.oo.Product;
import case02.buycat.withExceptionHandler.oo.Result;
import case02.buycat.withExceptionHandler.type.ResultEnum;
import lombok.Data;

@Data
public class ResultBuilder {
    public static Result success(Product product){
        Result result = new Result(ResultEnum.SUCCESS);
        result.setProduct(product);
        return result;
    }
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
