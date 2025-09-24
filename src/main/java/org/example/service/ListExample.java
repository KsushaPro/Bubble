package org.example.service;

import java.util.ArrayList;
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

        System.out.println(listStr.get(6));


    }
}
