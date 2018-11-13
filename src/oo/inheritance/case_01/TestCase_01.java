package oo.inheritance.case_01;

public class TestCase_01 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setColor();
        dog.setNickname();
        dog.sayHello();
        System.out.println("-------------");

        Person person = new Person();
//        person.setCet("4");
        person.setNickname();

        person.sayHello();
    }
}
