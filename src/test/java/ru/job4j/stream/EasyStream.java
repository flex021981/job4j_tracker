package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class EasyStream {
    private List<Integer> list;

    private EasyStream(List<Integer> list) {
        this.list = list;
    }

    private EasyStream() {
    }

    public static EasyStream of(List<Integer> source) {
        EasyStream rsl = new EasyStream();
        rsl.list = source;
        // throw new UnsupportedOperationException();
        return rsl;
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        //throw new UnsupportedOperationException();
        List<Integer> rsl = new ArrayList<>();
        for (Integer elem : list) {
            rsl.add(fun.apply(elem));
        }
        return new EasyStream(rsl);
    }

    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> rsl = new ArrayList<>();
        for (Integer elem : list) {
            if (fun.test(elem)) {
                rsl.add(elem);
            }
        }
        return new EasyStream(rsl);
        ///throw new UnsupportedOperationException();
    }

    public List<Integer> collect() {
        //throw new UnsupportedOperationException();
        return list;
    }
}
