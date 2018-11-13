package condition;

import java.util.Scanner;

public class TestCase_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入购买量");

        int count = sc.nextInt();

        if (count<1){
            System.out.println("不卖");
        }else  if (count>1 &&  count<=3){
            System.out.println("3元 一个");
        } else if (count>5 && count <= 100){
            System.out.println("5元 一个");
        }else {
            System.out.println("店铺卖给你");
        }
    }
}
