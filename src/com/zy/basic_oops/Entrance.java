package com.zy.basic_oops;

public class Entrance {
    public static void main(String[] args) {
        Person zhouyue = new Person() ;
        zhouyue.name = "zhouyue" ;
        zhouyue.age = 28 ;
        zhouyue.height = 170 ;

        System.out.println(zhouyue.name + " is now " + zhouyue.age + " years old.");

    }
}
