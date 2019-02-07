package com.zy.array;
// 用于去掉数组中的0 元素
// 思路1:计算非0元素的个数，算出新数组的长度。添加进入新数组
// 优化 完成后 可arrayBefore = null 释放内存  垃圾回收器GC可以释放
// index++ 可以写成arrayAfter[index++]  先取值在自增
public class ArrayNoZero {
    ArrayNoZero(int[] arrayBefore) {
        int count = 0;
        for (int i = 0; i < arrayBefore.length ; i++) {
            if (arrayBefore[i] != 0) {
                count++;
            }
        }
        int[] arrayAfter = new int[count];
        int index = 0;
        for (int i = 0; i < arrayBefore.length; i++) {

            if (arrayBefore[i] != 0 ){
                arrayAfter[index] =  arrayBefore[i];
                index ++;
            }
        }
    }
}
