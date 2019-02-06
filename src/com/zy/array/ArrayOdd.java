package com.zy.array;
//
public class ArrayOdd {
    ArrayOdd(int maxnum) {
        int[] odds = new int[maxnum/2 + 1];
        for (int i = 0; i < odds.length ; i++) {
            odds[i] = 2*i + 1;
        }
        for(int numbers : odds) {
            System.out.println(numbers);
        }
    }

    public static void main(String[] args) {
        ArrayOdd test = new ArrayOdd(1999);
    }
}



