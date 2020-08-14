package com.atguigu.bean;

import java.util.ArrayList;

public class TemplateTest {

    //模板六：
    private static final Customer CUST = new Customer();

    //变形：
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "china";

    //模板一：main /psvm
    public static void main(String[] args) {

        //模板二：
        System.out.println("hello");
        //变形：soutp / soutm /soutv /xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);


        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","Hanmeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        //变形： iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形: itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

//        模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method(){
        System.out.println();
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);

        //模板五：ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }

        //变形：xxx.nn / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }


    }

}
