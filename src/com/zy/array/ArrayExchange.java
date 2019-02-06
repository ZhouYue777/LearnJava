package com.zy.array;

import java.sql.SQLOutput;

// 此作业交换两个数组的对应元素
// 思路：
// 两个数组能交换元素，说明储存的数据类型相同。
// 两个引用，指向两个堆内存空间
// 建立另一个和他们相同类型的数组。
// 复制一个a 为C  取b值赋给a   取C值赋给B
// 以int[]组为例
public class ArrayExchange {
    ArrayExchange(int[] arrayA,int[] arrayB) {
        int[] arrayC = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i];
        }
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = arrayB[i];
        }
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayC[i];
        }
        // 以下打印以下两个数组以验证
        System.out.print("arrayA: ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.print("arrayB: ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " ");
        }

    }

    public static void main(String[] args) {
        ArrayExchange test = new ArrayExchange(new int[]{1, 2, 3},new int[]{4, 5, 6} );
    }
}
