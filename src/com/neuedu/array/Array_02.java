package com.neuedu.array;

public class Array_02 {
    public static void main(String[] args) {
        int a= 1;
        int[] b= {1};

        add1(a);
        add2(b);

        System.out.println(a);
        System.out.println(b[0]);
    }
    static void  add1(int a){
        a = a +1;
    }
    static void add2(int [] b){
        b[0] =b[0]+1;
    }
}
