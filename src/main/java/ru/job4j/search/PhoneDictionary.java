package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> containedInName = person -> person.getName().contains(key);
        Predicate<Person> containedInSurname = person -> person.getSurname().contains(key);
        Predicate<Person> containedInPhone = person -> person.getPhone().contains(key);
        Predicate<Person> containedInAddress = person -> person.getAddress().contains(key);
        Predicate<Person> combine = containedInName
                .or(containedInSurname)
                .or(containedInPhone)
                .or(containedInAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
