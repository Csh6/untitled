package oo.oo_01;

import lombok.Data;

import java.util.Arrays;

@Data
public class Person {
    private  String id;
    private  String name;
    private  String gender;//性别
    private  boolean isMarried;
    private  String tel;

    private Addr[] addr;
    private Person[] gf;
    private Person qr;


    //提供检查方法
    public boolean isIllegality(Person person){
        Person self = this;
        Person target = person;

        boolean flag_self = false;
        boolean flag_target = false;

        if (!self.isMarried && (self.getGf()==null || self.getGf().length<1)){
            flag_self = true;
        }
        if (!target.isMarried && (target.getGf()==null || target.getGf().length<1)){
            flag_target =true;
        }
        if (!flag_self){
            System.out.println(self.getName()+"不靠谱");
            return  flag_self;
        }
        else if (!flag_target){
            System.out.println(target.getName()+"不靠谱");
            return  flag_target;
        }
        else {
            System.out.println("百年好合");
            return true;
        }
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", isMarried=").append(isMarried);
        sb.append(", tel='").append(tel).append('\'');
        sb.append(", addr=").append(addr == null ? "null" : Arrays.asList(addr).toString());
        sb.append(", gf=").append(gf == null ? "null" : Arrays.asList(gf).toString());
        sb.append(", qr=").append(qr);
        sb.append('}');
        return sb.toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddr(Addr[] addr) {
        this.addr = addr;
    }

    public void setGf(Person[] gf) {
        this.gf = gf;
    }

    public void setQr(Person qr) {
        this.qr = qr;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public String getTel() {
        return tel;
    }

    public Addr[] getAddr() {
        return addr;
    }

    public Person[] getGf() {
        return gf;
    }

    public Person getQr() {
        return qr;
    }
}
