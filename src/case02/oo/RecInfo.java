package case02.oo;

import lombok.Data;

@Data
public class RecInfo {
    private  int id;
    private String addr;
    private  String recName;

    private boolean isDefault = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public RecInfo(int id, String addr, String recName, boolean isDefault){
        this.id = id;
        this.addr = addr;
        this.recName = recName;
        this.isDefault = isDefault;
    }
}
