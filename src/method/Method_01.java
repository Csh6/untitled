package method;

import java.util.Date;

public class Method_01 {
    public static void main(String[] args) {
        foo("jack",90);
        System.out.println(getTime());
    }
    static  void foo(String name,int price){
        System.out.println("Hello :"+ name +",你需要支付:"+ price+"无");
    }
    static  int add(int a,int b){
        return a+b;
    }
    static  String getTime(){

        Date data = new Date();
        return data.toString();
    }
}
