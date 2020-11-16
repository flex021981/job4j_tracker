package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        System.out.println(
                matrix.stream()
                        .flatMap(e -> e.stream())
                        .collect(Collectors.toList())
        );

        Integer[][] matrixInts = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(
                Stream.of(matrixInts).flatMap(Stream::of).collect(Collectors.toList())
                );
    }
}
