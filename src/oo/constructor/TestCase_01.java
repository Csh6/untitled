package oo.constructor;

public class TestCase_01 {
    public static void main(String[] args) {
        CakeEgg ce = new CakeEgg(4,false,2);

        System.out.println(ce.getEgg());
        System.out.println(ce.getJiPai());
        System.out.println(ce.isLa());

    }
}
