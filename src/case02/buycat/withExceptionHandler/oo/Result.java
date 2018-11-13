package case02.buycat.withExceptionHandler.oo;

import case02.buycat.withExceptionHandler.type.ResultEnum;
import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String msg;
    private Product product;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Result(){

    }
    public Result(ResultEnum resultEnum){
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Result{");
        sb.append("code=").append(code);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", product=").append(product);
        sb.append('}');
        return sb.toString();
    }
}
