package com.yzg.demo.base;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JavaTestBase {
    public static void main(String[] args) {
        System.out.println("start");

        // 测试
        int a=1;
        Integer b=1;
        System.out.println(a==b);
        String c="tests";
        System.out.println(c.equals("tests"));
        System.out.println(c.contains("e"));
        System.out.println(c.charAt(1));
        System.out.println(c.compareTo("testssssssssss"));
        System.out.println(c.concat("xxxx"));
        System.out.println(c.substring(1,2));
        System.out.println(c.endsWith("s"));
        System.out.println(" sf  df ".trim());
        System.out.println(c.length());
        String[] d = c.split("s");
        System.out.println(c.indexOf("s"));

        List<String> stringList=new ArrayList<String>();
        System.out.println(Optional.of(stringList).isPresent());

    }








}
