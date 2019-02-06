package com.zy.basic_oops;

public class Person {
    // 成员变量   修饰符 数据类型  数据引用  赋值
    public String name;
    public int age;
    public double height;


    // 成员方法
    public void eat(String food, int count) {
        System.out.println("吃了:" + count + "份 " + food);

    }

    // 设计一个方法 先想需不需要条件  再想留下什么结果（返回值）
    // 需要提供钱
    // 需要留下饮料
    public String buyDrink(int money) {
        if(money > 5) {
            return "红牛";
        }else {
            return "怡宝";
        }

    }
    public void sleep() {

    }

    // 构造方法
    Person(){

    }

    Person(String name, int age, double height) {
        this.age = age;
        this.name = name;
        this.height = height;


    }
}
