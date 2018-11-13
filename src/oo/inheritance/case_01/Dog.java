package oo.inheritance.case_01;

import lombok.Data;

@Data
public class Dog  extends  Animal{
    private String color;

    @Override
    public void sayHello(){
        System.out.println("wang wang");
    }

    public void setColor() {
        System.out.println("black");
    }
    public void setNickname(){
        System.out.println("tom");
    }
}
