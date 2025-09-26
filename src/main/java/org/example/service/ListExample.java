package org.example.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(5);
        listInt.add(6);
        listInt.add(8);
        listInt.add(1);
        listInt.add(10);
        listInt.add(11);
        listInt.add(12);

        System.out.println(listInt);

        List<String> listStr = new ArrayList<>();
        listStr.add("1");
        listStr.add("6");
        listStr.add("8");
        listStr.add("Привет");
        listStr.add("Диван");
        listStr.add("Стол");
        listStr.add("Ксюша");

        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";

        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        listStr.addAll(fruits);
        listStr.addAll(List.of(s1, s2, s3, s1,s1,s1,s1,s1,s2,s3,s1,s2,s3));


        System.out.println(listStr);
        System.out.println(listStr.size());
        listStr.remove(5);

        listStr.removeAll( List.of(s1, s2) );
        System.out.println(listStr);
        boolean isContains = listStr.contains("Apple");
        System.out.println("Коллекция listStr содержит строку \"Apple?\": " + isContains);
        listStr.remove("Apple");
        isContains = listStr.contains("Apple");
        System.out.println("Коллекция listStr содержит строку \"Apple?\": " + isContains);
        listStr.removeAll(List.of("ccc"));
        System.out.println("Коллекция listStr содержит строку \"ccc\"?: " + listStr.contains("ccc"));


        ListService listService = new ListService();
        List<String> resultStrings = listService
                .of("aaa")
                .of("bbb", "ccc")
                .of("a", "b", "c")
                .of(fruits)
                .getResult();

        System.out.println(resultStrings);

        // Частеы МЕТОДЫ LIST: add, size, remove, isEmpty, contains,toArray, containsAll, addAll,
        // removeAll, retain, sort, sublist ит.д.



    }
}