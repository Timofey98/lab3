package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassInfo {
    public void getInfoClass(Class c) {
        System.out.println("Имя класса " + c.getName());

        Field[] fields = c.getDeclaredFields();
        System.out.println("Поля класса:");
        if (fields.length != 0)
            for (Field field : fields)
                System.out.println(field.toString());
        else System.out.println("Поля не найдены");

        Constructor[] constr = c.getDeclaredConstructors();
        System.out.println("Конструкторы класса:");
        if (constr.length != 0)
            for (Constructor cnst : constr)
                System.out.println(cnst.toString());
        else System.out.println("Конструкторы не найдены");

        Class[] interfaces = c.getInterfaces();
        System.out.println("Интерфейсы классов:");
        if (interfaces.length != 0)
            for (Class i : interfaces)
                System.out.println(i.toString());
        else System.out.println("Интерфейсы не найдены");

        Method[] methods = c.getDeclaredMethods();
        System.out.println("Методы класса:");
        if (methods.length != 0)
            for (Method method : methods)
                System.out.println(method.toString());
        else System.out.println("Методы не найдены");

        Annotation[] an = c.getAnnotations();
        System.out.println("Аннотаци класса:");
        if (an.length != 0) {
            for (Annotation a : an)
                System.out.println(a.toString());
        }
        else System.out.println("Аннотации не найдены");

        Class parents = c.getSuperclass();
        System.out.println("Предки класса:");
        if (parents != null) {
            System.out.println(parents.getName() +"\n");
            getInfoClass(parents);
        }
        else System.out.println("Предки не найдены\n");
    }
}
