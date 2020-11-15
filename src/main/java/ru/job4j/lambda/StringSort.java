package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    public static void main(String[] args) {
        String[] str = {"One", "Two", "Three", "Four", "Five", "Six"};
        Comparator<String> cmpSize = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
                return Integer.compare(left.length(), right.length());
            };
        //Comparator<String> cmpSize = Comparator.comparingInt(String::length);
        Arrays.sort(str, cmpSize);
        System.out.println(Arrays.toString(str));

    }
}
