package com.neuedu.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_01 {
    static int[] arr ={1,2,3,4};
    static int arr2[]={1,2,3,4};
    static  int arr3[] = new int[4];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr3));
        //获取数组长度
        System.out.println("arr.length:"+arr.length);
        //数组下标 开始值为：0
        System.out.println("arr[0] ->"+arr[3]);
        arr3[0] = 1;
        arr3[1] = 1;
        arr3[2] = 1;
        arr3[3] = 1;
        System.out.println(Arrays.toString(arr3));
    }
}
