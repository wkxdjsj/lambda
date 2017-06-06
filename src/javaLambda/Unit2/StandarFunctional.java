package javaLambda.Unit2;

import javaLambda.Unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
/**
 * Created by xikaixiong on 6/6/17.
 */
public class StandarFunctional {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("e1", "z1", 1),
                new Person("d2", "y2", 2),
                new Person("c3", "x3", 3),
                new Person("b4", "x4", 4),
                new Person("a5", "v5", 5)
        );
        //step 1: sort by last name
//        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        //static method can be used as below form and has the same functionality as normal lambda expression
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        //step 2: create a method that prints all elements in the list
        printConditionally(people,person->true);

        System.out.println("-------------------");
        //step 3: create a method that prints all people having last name beginning with x
        printConditionally(people,person->person.getLastName().startsWith("x"));


        System.out.println("====================");
        printConditionally(people,person -> person.getAge()>2);

        System.out.println("*********************");
        printConditionally2(people,person -> true,person -> System.out.println(person.getAge()));

        System.out.println("*********************");
        printConditionally3(people,person -> true,person -> System.out.println(person.getAge()));


        System.out.println("--------------------");
        printConditionally2(people,person -> true,person -> person.getLastName());
        System.out.print("\n");
        printConditionally3(people,person -> true,person -> person.getLastName());
    }

    private static void printConditionally(List<Person> people,Predicate<Person> predicate){
        for(Person each:people){
            if (predicate.test(each)) {
                System.out.println(each.getLastName());
            }
        }
    }

    private static void printConditionally2(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person each:people){
            if(predicate.test(each)){
                System.out.print(each.getFirstName()+" "+each.getLastName()+" ");
                consumer.accept(each);
            }
        }
    }

    private static void printConditionally3(List<Person> people,Predicate<Person> predicate,MofangComsumer mfc){
        for(Person each:people){
            if (predicate.test(each)) {
                mfc.acept(each);
                System.out.print(each.getFirstName()+" "+each.getLastName()+" ");
            }
        }
    }

    interface MofangComsumer{
        void acept(Person p);
    }

}
