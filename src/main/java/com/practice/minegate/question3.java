package com.practice.minegate;

public class question3 {

	static void show(Integer i) {
        System.out.println("Integer");
    }
    static void show(Object  str) {
        System.out.println("Str");
    }
    public static void main(String[] args) {
        show(null);
    }
}
