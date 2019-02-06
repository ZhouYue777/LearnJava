package com.zy.array;

public class TestArray {
    public static void main(String[] args) {
        int[] array = new int[]{10,20,30,40,50};

        int value = array[0];
        System.out.println(value);

        array[3] = 99;
        System.out.println(array[3]);

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        for (int nums : array) {
            System.out.println(nums);
        }
    }
}
