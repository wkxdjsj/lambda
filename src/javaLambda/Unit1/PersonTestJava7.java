package javaLambda.Unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by xikaixiong on 6/6/17.
 */
public class PersonTestJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("e1", "z1", 1),
                new Person("d2", "y2", 2),
                new Person("c3", "x3", 3),
                new Person("b4", "x4", 4),
                new Person("a5", "v5", 5)
        );


        //step 1: sort by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //step 2: create a method that prints all elements in the list
        printAll(people);


        System.out.println("-------------------");
        //step 3: create a method that prints all people having last name beginning with x
        printLastNameBeginningWithC(people);


        System.out.println("====================");

        printConditionally(people, new Condition() {
            @Override
            public boolean isPerson(Person person) {
                return person.getLastName().startsWith("x");
            }
        });



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

    interface Condition{
        boolean isPerson(Person person);
    }




}


