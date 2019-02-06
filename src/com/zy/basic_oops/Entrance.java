package com.zy.basic_oops;

public class Entrance {
    public static void main(String[] args) {
        Person zhouyue = new Person() ;
        zhouyue.name = "zhouyue" ;
        zhouyue.age = 28 ;
        zhouyue.height = 170 ;

        Person zhouyue1 = new Person("zhouyue_young" , 18 , 160) ;
        System.out.println(zhouyue.name + " is now " + zhouyue.age + " years old.") ;
        System.out.println(zhouyue1.name + " was " + zhouyue1.age + " years old.") ;

        zhouyue.eat("potpie", 3);
        zhouyue.buyDrink(999);
        zhouyue.drawStar(5, "left");



    }
}
