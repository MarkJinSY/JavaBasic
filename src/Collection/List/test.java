package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class test {

    static class template {
        private String m;
        private String n;

        public template(){};
    }

    public static void main(String[] args) {
        List<template> a = new ArrayList<>();
        template temp = new template();
        temp.m = "aaa";
        temp.n = "bbb";

        a.add(temp);
        String b = a.get(a.indexOf("aaa")).n;
        boolean c = a.contains("0");
        System.out.println(b + " " + c);
    }
}
