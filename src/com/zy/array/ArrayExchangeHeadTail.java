package com.zy.array;
// 此作业要求： 单个数组，头尾互换
// 思路： 取出头。 赋值给临时存储  尾赋值给头   临时赋值给尾
public class ArrayExchangeHeadTail {
    ArrayExchangeHeadTail(int[] testArray) {
        int temp = testArray[0];
        testArray[0] = testArray[testArray.length - 1];
        testArray[testArray.length - 1] = temp;

        for (int i = 0; i < testArray.length ; i++) {
            System.out.print(testArray[i]);
        }

    }


    public static void main(String[] args) {
        ArrayExchangeHeadTail test = new ArrayExchangeHeadTail(new int[]{1,2,3,4,5,6,7});
    }

}
