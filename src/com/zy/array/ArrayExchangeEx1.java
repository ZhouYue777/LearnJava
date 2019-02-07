package com.zy.array;

import java.sql.SQLOutput;

// 交换两个数组元素升级版1
// 用于数组长度不同。
public class ArrayExchangeEx1 {
    ArrayExchangeEx1(int[] arrayA, int[] arrayB) {
        int[] temp = arrayA;
        arrayA = arrayB;
        arrayB = temp;

        for (int nums : arrayA){
            System.out.print(nums);
        }
        System.out.println();
        for (int nums : arrayB) {
            System.out.print(nums);
        }
    }

    public static void main(String[] args) {
        ArrayExchangeEx1 test = new ArrayExchangeEx1(new int[]{1,2,3,4},new int[]{6,7,7,7,7,7} );
    }
}
