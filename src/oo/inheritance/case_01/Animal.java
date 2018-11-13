package oo.inheritance.case_01;

import lombok.Data;

@Data
public class Animal {
    private String nickname;
    public void color(){
        System.out.println("black");
    }
    public void sayHello(){
        System.out.println("default ...");
    }
    public  void setNickname() {
        System.out.println("name");
    }

}
