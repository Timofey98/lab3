package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {

    public static void main(String[] args) {
        System.out.println("       List");
        List<String> list = new ArrayList<>();
        list.add("Строка 1");
        list.add("Строка 1");
        list.add("Строка 2");
        System.out.println("Вывод list целиком: " + list);
        System.out.println("Вывод List по элементам:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(i+": "+list.get(i));
        System.out.println();

        System.out.println("       Set");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Строка 1");
        hashSet.add("Строка 1");
        hashSet.add("Строка 2");
        hashSet.add("Строка 2.");
        System.out.println("Вывод HashSet: " + hashSet);
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Строка 1");
        treeSet.add("Строка 1");
        treeSet.add("Строка 2");
        treeSet.add("Строка 2.");
        System.out.println("Вывод TreeSet: " + treeSet);
        System.out.println("Первый элемент: " + treeSet.first());
        System.out.println("Последний элемент: " + treeSet.last());
        treeSet.remove("Строка 1");
        System.out.println("TreeSet: " + treeSet);
        System.out.println();

        System.out.println("       Map");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Строка 1");
        hashMap.put(2, "Строка 2");
        hashMap.put(3, "Строка 3");
        System.out.println("Вывод Map" + hashMap);
        System.out.println("Проверка содержания ключа 2 "+ hashMap.containsKey(2));
        System.out.println("Получить строку по ключу 2 " + hashMap.get(2));
        System.out.println();
    }
}
