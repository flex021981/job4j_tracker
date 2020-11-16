package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{"
                    + "name='" + name + '\''
                    + ", spent=" + spent
                    + '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        //1. Фильтрация.
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        //bugs.forEach(System.out::println);

        //2. Преобразование.
        List<String> names = tasks.stream().map(
                task -> task.name
        ).collect(Collectors.toList());

        //3. Упрощение.
        long total = tasks.stream().map(
                task -> task.spent
        ).reduce(0L, Long::sum);

        //4. Аккумуляция.
        List<Task> bugs4 = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());

        //Задание
        List<Integer> intList = Arrays.asList(
                1, 2, 3, 4, 5, 6, -6, -10
        );
        List<Integer> sortList = intList
                .stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());
        sortList.forEach(System.out::println);
    }
}
