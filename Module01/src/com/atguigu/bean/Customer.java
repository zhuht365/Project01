package com.atguigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static java.awt.Event.F10;

public class Customer {

    private static int anInt;

    public static void main(String[] args) {
        System.out.println("helloworld!!!");
        ArrayList<String> al = new ArrayList<String>();

        ArrayList list1 = null;

        ArrayList list2 = null;
//        list2.add();
        method2();
        System.out.println(list1);

    }

    public static void method2() {

        anInt = F10;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
