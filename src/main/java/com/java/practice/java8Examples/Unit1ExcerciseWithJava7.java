package com.java.practice.java8Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseWithJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Tapan","Das",34),
                new Person("Manoj","Gupta",30),
                new Person("Sudhir","Ranjan",28),
                new Person("Manish","Pandey",26),
                new Person("Ankit","Singh",37)
        );
        //Step 1 :sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //Step 2: Create a method that prints all elements in list
        printAll(people);
        //Step 3 : Create a method that prints all people that have last name begining with C
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person p:people){
            if(condition.test(p))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {
        for(Person p:people){
            System.out.println(p);
        }
    }
}
interface  Condition{
    boolean test(Person p);
}
