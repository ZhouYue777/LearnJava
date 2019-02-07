package com.zy.array;
// 需求：求最大值最小值平均值
public class ArrayMaxMinAvg {
    int max;
    int min;
    double avg;
    int sum;
    ArrayMaxMinAvg(int[] arrayA) {
//        int max = arrayA[0];   定义在这里边，为局部变量，外边不好调用。改为成员变量。
//        int min = arrayA[0];
//        int avg;
//        int sum;
        max = arrayA[0];
        min = arrayA[0];

        for (int i = 0; i < arrayA.length ; i++) {
            if (arrayA[i] > max) {
                max = arrayA[i];
            }
            if (arrayA[i] < min) {
                min = arrayA[i];
            }
            sum = sum + arrayA[i];
        }
        avg = (double)sum/arrayA.length;
    }


    public static void main(String[] args) {
        ArrayMaxMinAvg test = new ArrayMaxMinAvg(new int[]{3,3,1,6,4,3,2});
        System.out.println("最小值为" + test.min);
        System.out.println("最大值为" + test.max);
        System.out.println("平均值为" + test.avg);

    }


}
