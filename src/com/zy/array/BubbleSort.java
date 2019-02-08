package com.zy.array;

public class BubbleSort {
    int[] arrayBefore;


    BubbleSort(int[] arrayBefore) {
        this.arrayBefore = arrayBefore;
    }


    public int[] down(){
        for (int j = 1; j < arrayBefore.length - 1 ; j++ ) {
            for (int i = 0; i < arrayBefore.length - j ; i++) {
                if (arrayBefore[i] < arrayBefore[i + 1]) {
                    int temp = arrayBefore[i];
                    arrayBefore[i] = arrayBefore[i + 1];
                    arrayBefore[i + 1] = temp;
                }
            }
        }
        return arrayBefore;
    }

    public static void main(String[] args) {
        BubbleSort test = new BubbleSort(new int[]{3,5,6,7,1,2});
        for (int nums : test.down()) {
                System.out.println(nums);
            }

    }





}
