package singleton.simplefactory;

public class FruitFactory {
    public static FruitFactory(String fruitName){
        if ("apple".equals(fruitName)){
            System.out.println("包装苹果");
            return; new Apple();
        }
    }
}
