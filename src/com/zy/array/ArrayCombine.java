package com.zy.array;
// 给定两个数组 合并两个数组
// 注意 构造方法不能加返回值
public class ArrayCombine {
    public ArrayCombine(int[]arrayA, int[]arrayB) {
        int[] result = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length ; i++) {
            result[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length ; i++) {
            result[i + arrayA.length] = arrayB[i];
        }
        for (int ints : result) {
            System.out.println(ints);
        }

    }

    public static void main(String[] args) {
        ArrayCombine test = new ArrayCombine(new int[]{1,2,3,4}, new int[]{1,3,4,5,6});
    }

}
