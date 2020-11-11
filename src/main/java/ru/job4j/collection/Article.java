package ru.job4j.collection;

import java.util.Arrays;
import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {
        origin = origin.replaceAll("\\p{Punct}", "");
        List<String> originList = Arrays.asList(origin.toLowerCase().split(" "));
        List<String> lineList = Arrays.asList(line.toLowerCase().split(" "));
        for (String word : lineList) {
            if (!originList.contains(word)) {
                return false;
            }
        }
        return true;
    }
}
