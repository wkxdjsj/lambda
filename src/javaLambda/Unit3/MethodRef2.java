package javaLambda.Unit3;

import javaLambda.Unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by xikaixiong on 6/6/17.
 */
public class MethodRef2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("e1", "z1", 1),
                new Person("d2", "y2", 2),
                new Person("c3", "x3", 3),
                new Person("b4", "x4", 4),
                new Person("a5", "v5", 5)
        );

        printConditionally(people,person -> true,person -> System.out.println("consumer is void"));
        printConditionally(people,person -> true,System.out::println);
    }


    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person each : people) {
            if(predicate.test(each)){
                consumer.accept(each);
            }
        }
    }
}
