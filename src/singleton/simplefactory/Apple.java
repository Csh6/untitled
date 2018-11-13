package singleton.simplefactory;

public class Apple extends Fruit {

    @Override
    void grow() {
        System.out.println("Apple is growing");
    }

    @Override
    void harvest() {
        System.out.println("Apple has been harvested");
    }

    @Override
    void plant() {
        System.out.println("Apple has been planted.");
    }
}
