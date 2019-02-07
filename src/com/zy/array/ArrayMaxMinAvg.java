package com.zy.array;
// 需求：求最大值最小值平均值
public class ArrayMaxMinAvg {
    int max;
    int min;
    int avg;
    ArrayMaxMinAvg(int[] arrayA) {
        max = arrayA[0];
        min = arrayA[0];
        for (int i = 1; i < arrayA.length ; i++) {
            if (arrayA[i] > max) {
                max = arrayA[i];
            }
            if (arrayA[i] < min) {
                min = arrayA[i];
            }
        }



    }
}
