package logic;

import java.util.Scanner;

public class TestCase_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎进入系统");
        System.out.println("请输入登录姓名");

        String account = sc.next();
//        String name = sc.next();

        //取反
//        if (!account.equals("tom")){
//            System.out.println("tom 登录");
//        }else {
//            System.out.println("其他用户登录");
//        }

        if ("tom".equals(account)){
            System.out.println("tom 登录");
        }else {
            System.out.println("其他用户登录");
        }

    }
}
