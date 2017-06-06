package javaLambda.Unit3;

import javaLambda.Unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by xikaixiong on 6/6/17.
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("e1", "z1", 1),
                new Person("d2", "y2", 2),
                new Person("c3", "x3", 3),
                new Person("b4", "x4", 4),
                new Person("a5", "v5", 5)
        );
        people.stream().forEach(person -> System.out.println(person));
        System.out.println("============");
        people.stream().forEach( System.out::println);
        System.out.println("============");
        people.stream().filter(person -> person.getLastName().startsWith("x")).forEach(person -> System.out.println("name with x "+person.getLastName()));
        //parallelStream works like Stream but split it into multi parts which force the most use of cpu
        Stream<Person> personStream = people.parallelStream();
        int i = (int) personStream.filter(person -> person.getLastName().startsWith("x")).count();
        System.out.println(i);
    }
}
