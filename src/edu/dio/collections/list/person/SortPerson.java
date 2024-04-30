package edu.dio.collections.list.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPerson {
    private List<Person> people;

    public SortPerson() {
        this.people = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        people.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        List<Person> peopleAge = new ArrayList<>(people);

        Collections.sort(peopleAge);

        return peopleAge;
    }

    public List<Person> sortByHeight() {
        List<Person> peopleHeight = new ArrayList<>(people);

        Collections.sort(peopleHeight, new ComparatorByHeight());

        return peopleHeight;
    }

    public static void main(String[] args) {
        SortPerson sortPerson = new SortPerson();

        sortPerson.addPerson("Person 1", 20, 1.75);
        sortPerson.addPerson("Person 2", 25, 1.69);
        sortPerson.addPerson("Person 3", 23, 1.71);

        System.out.println(sortPerson.sortByAge());
        System.out.println(sortPerson.sortByHeight());
    }
}
