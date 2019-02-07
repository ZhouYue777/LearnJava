package com.zy.array;
// 新版互换两个数组元素
// 使用一个循环完成

public class ArrayExchangeEx {

    ArrayExchangeEx(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length ; i++) {
            int temp = arrayA[i];
            arrayA[i] = arrayB[i];
            arrayB[i] = temp;
        }
    }
}
