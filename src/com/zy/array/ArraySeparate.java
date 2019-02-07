package com.zy.array;
// 拆分一个数组，从最大值处，去掉最大值
public class ArraySeparate {

    public static void main(String[] args) {
        ArraySeparate test = new ArraySeparate(new int[]{1,3,4,88,6,5,4,3});
    }

    ArraySeparate(int[] arrayA) {
        int max = arrayA[0];
        int index = 0;
        for (int i = 0; i < arrayA.length ; i++) {
            if (arrayA[i] > max ) {
                max = arrayA[i];
                index = i;
            }
        }
        int[] arrayB = new int[index];
        int[] arrayC = new int[arrayA.length - index - 1];

        for (int i = 0; i <index ; i++) {
            arrayB[i] = arrayA[i];
        }
        for (int i = 0; i <arrayC.length ; i++) {
            arrayC[i] = arrayA[index +1 +i];
        }
        for (int nums : arrayB) {
            System.out.println(nums);
        }
    }


}
