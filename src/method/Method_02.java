package method;

import java.util.Scanner;

public class Method_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = add(a);
        System.out.println(result);
    }
    static  int add(int a){
        int b=20;
        return  a+b;
    }
}
