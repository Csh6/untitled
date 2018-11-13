package oo.oo_01;

import lombok.Data;

@Data
public class Addr {
    private String code;
    private String detail;

    public Addr(String code,String detail){
        this.code=code;
        this.detail=detail;
    }

    public Addr() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Addr{");
        sb.append("code='").append(code).append('\'');
        sb.append(", detail='").append(detail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
