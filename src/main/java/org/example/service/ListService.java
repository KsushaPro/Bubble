package org.example.service;

import java.util.ArrayList;
import java.util.List;

public class ListService {

    private List<String> list = new ArrayList<>();

    public ListService of(String a) {
        list.add(a);
        return this;
    }

    public  ListService of(String a, String b) {
        list.addAll(List.of(a, b));
        return this;
    }

    public  ListService of(String a, String b, String c) {
        list.addAll(List.of(a, b, c));
        return this;
    }

    public ListService of(List<String> l) {
        this.list.addAll(l);
        return this;
    }

    public List<String> getResult() {
        return this.list;
    }

    public ListService deleteAll() {
        this.list = new ArrayList<>();
        return this;
    }


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
