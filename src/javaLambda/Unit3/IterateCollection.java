package javaLambda.Unit3;

import javaLambda.Unit1.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xikaixiong on 6/6/17.
 */
public class IterateCollection {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("e1", "z1", 1),
                new Person("d2", "y2", 2),
                new Person("c3", "x3", 3),
                new Person("b4", "x4", 4),
                new Person("a5", "v5", 5)
        );

        System.out.println("----normal for each----");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("----for each----");
        for (Person each : people) {
            System.out.println(each);
        }
        System.out.println("----lambda for each----");

        people.forEach(person -> System.out.println(person));

        //this loop doesn't care the order just loop through it
        System.out.println("----lambda for each----");
        people.forEach(System.out::println);
    }
}
