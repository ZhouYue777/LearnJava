package com.zy.array;
/**
 * @Author: zY
 * @Date: 2019/2/9 11:22
 * @Version 1.0
 */
public class ArrayTwoDementional {
    int[][] arrayA;

    ArrayTwoDementional(int[][] arrayA) {
        this.arrayA = arrayA;
    }

    public void print() {

        for (int[] arrayIn : arrayA) {
            for (int nums : arrayIn) {
                System.out.println(nums);
            }
        }
    }

    public static void main(String[] args) {
        ArrayTwoDementional test = new ArrayTwoDementional(new int[][]{{1, 2, 3}, {4, 4, 4}, {5, 4, 3} });
        test.print();
    }

}














