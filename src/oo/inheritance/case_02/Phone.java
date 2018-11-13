package oo.inheritance.case_02;

import lombok.Data;

@Data
public class Phone extends  Product {
    protected   String cpu;
    protected   String memory;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Phone{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", memory='").append(memory).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
