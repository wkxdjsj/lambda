package javaLambda.Unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by xikaixiong on 6/6/17.
 */
public class PersonTestJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("e1", "z1", 1),
                new Person("d2", "y2", 2),
                new Person("c3", "x3", 3),
                new Person("b4", "x4", 4),
                new Person("a5", "v5", 5)
        );


        //step 1: sort by last name
//        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        //step 2: create a method that prints all elements in the list
        printAll(people);


        System.out.println("-------------------");
        //step 3: create a method that prints all people having last name beginning with x
        printLastNameBeginningWithC(people);


        System.out.println("====================");

        printConditionally(people, person -> person.getLastName().startsWith("x"));

        System.out.println("*********************");


        printConditionally(people,person ->true);

        System.out.println("using function interface predicate:");
        printConditionally2(people,person->true);

    }

    private static void printAll(List<Person> people) {
        for(Person each:people){
            System.out.println(each.getLastName());
        }
    }

    private static void printLastNameBeginningWithC(List<Person> people) {
        for(Person each:people){
            if(each.getLastName().startsWith("x")){
                System.out.println(each.getLastName());
            }
        }
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person each:people){
            if(condition.isPerson(each)){
                System.out.println(each.getLastName());
            }
        }
    }

    private static void printConditionally2(List<Person> people, Predicate predicate) {
        for(Person each:people){
            if(predicate.test(each)){
                System.out.println(each.getLastName());
            }
        }
    }

    interface Condition{
        boolean isPerson(Person person);
    }
}
