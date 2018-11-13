package cacl;

public class TestCase_03 {
    //不用循环用代码实现循环
    public static void main(String[] args) {
        String[] chuan={"ni","wo","ta"};
        int i =0;
        System.out.println(chuan[i++%3]);
        System.out.println(chuan[i++%3]);
        System.out.println(chuan[i++%3]);
        System.out.println(chuan[i++%3]);
        System.out.println(chuan[i++%3]);
        System.out.println(chuan[i++%3]);
        System.out.println(chuan[i++%3]);

    }
}
