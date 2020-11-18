package ru.job4j.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {

    public List<Integer> arrayToList(Integer[][] array) {
        List<Integer> rsl = Stream
                .of(array)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
        return rsl;
    }

    public List<Integer> arrayToList(List<List<Integer>> array) {
        List<Integer> rsl = array.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        return rsl;
    }

    public static void main(String[] args) {
        MatrixToList matrix = new MatrixToList();
        List<List<Integer>> matrixlist = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        System.out.println(matrix.arrayToList(matrixlist));

        Integer[][] matrixInts = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(
                matrix.arrayToList(matrixInts));
    }
}
