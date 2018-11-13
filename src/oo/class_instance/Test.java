package oo.class_instance;

public class Test {
    public static void main(String[] args) {
        System.out.println("----- start");

        Stu tom = new Stu();
        Stu jack = new Stu();
        tom = jack;

        jack.no = 2;
        jack.name ="black";
        jack.age = 30;

        System.out.println("学号："+tom.no);
        System.out.println("姓名："+tom.name);
        System.out.println("年龄："+tom.age);

        tom.dev();
        tom.playGame("吃鸡");
        System.out.println("-------------------");

        System.out.println("学号："+jack.no);
        System.out.println("姓名："+jack.name);
        System.out.println("年龄："+jack.age);
    }
}
