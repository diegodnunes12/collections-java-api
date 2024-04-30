package edu.dio.collections.list.person;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(age, person.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
    }
}

/**
 * InnerPerson
 */
class ComparatorByHeight implements Comparator<Person> {

    @Override
    public int compare(Person arg0, Person arg1) {
        return Double.compare(arg0.getHeight(), arg1.getHeight());
    }

    
}
