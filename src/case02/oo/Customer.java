package case02.oo;

import lombok.Data;

import java.util.Arrays;

@Data
public class Customer {

    private  int id;
    private  String name;

    private RecInfo[] recInfos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecInfo[] getRecInfos() {
        return recInfos;
    }

    public void setRecInfos(RecInfo[] recInfos) {
        this.recInfos = recInfos;
    }

    public Customer(){

    }
    public Customer(int id,String name,RecInfo[] recInfos){
        this.id = id;
        this.name = name;
        this.recInfos = recInfos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", recInfos=").append(recInfos == null ? "null" : Arrays.asList(recInfos).toString());
        sb.append('}');
        return sb.toString();
    }
}
