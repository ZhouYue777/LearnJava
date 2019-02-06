package com.zy.array;
// 创建一个数组打印1 - 任意的偶数

public class ArrayEven {

    ArrayEven(int maxnum) {
        int[] evens = new int[maxnum/2];
        for (int i = 0; i < evens.length ; i++) {
            evens[i] = 2 * (i + 1);
        }

        for (int x : evens) {
            System.out.println(x);
        }

    }

    public static void main(String[] args){
        ArrayEven first = new ArrayEven(999);
    }
}

