package case02.buycat.withExceptionHandler.exception;

import case02.buycat.withExceptionHandler.type.ResultEnum;
import lombok.Data;

@Data
public class LowStockException extends Exception {
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public LowStockException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
