package com.company;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generic {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Строка 1");
        list.add("Строка 2");
        for (Object s : list) {
            System.out.println(s);
        }
        System.out.println();

        List list2 = new ArrayList();
        list2.add("Строка 1");
        list2.add(1);
        for (Object str : list2) {
            System.out.println(str);
        }
        System.out.println();

        List gList = Arrays.asList("Строка 1", "Строка 2");
        for (Object obj : gList) {
            System.out.println(Generic.<String>getValue(obj));
        }
    }

    public static <T> T getValue(Object obj) {
        return (T) obj;
    }

}
