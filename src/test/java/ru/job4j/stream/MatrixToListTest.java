package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {
    private MatrixToList matrix = new MatrixToList();

    @Test
    public void intMatrixToList() {
        Integer[][] matrixInts = {
                {1, 2, 3},
                {4, 5, 6}
        };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> rsl = matrix.arrayToList(matrixInts);
        assertThat(rsl, is(expected));
    }

    @Test
    public void listMatrixToList() {
        List<List<Integer>> matrixlist = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        List<Integer> rsl = matrix.arrayToList(matrixlist);
        assertThat(rsl, is(expected));
    }
}