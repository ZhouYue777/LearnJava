package com.zy.array;
// 用于去掉数组中的0 元素
// 思路1:计算非0元素的个数，算出新数组的长度。添加进入新数组
// 思路2:找出0元素的位置。记录这些位置
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
