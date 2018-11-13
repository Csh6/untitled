package oo.inheritance.case_01;

import lombok.Data;

@Data
public class Person extends  Animal{
    private String cet;

    @Override
    public  void setNickname(){
        System.out.println("tom");
    }

    public void sayHello(){
        System.out.println("吃了吗？");
    }
}
