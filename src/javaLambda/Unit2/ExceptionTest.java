package javaLambda.Unit2;

import java.util.function.BiConsumer;

/**
 * Created by xikaixiong on 6/6/17.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

//        process(someNumbers, key, (i, k) -> System.out.println(i + k));
        //blow still not elegant
//        process(someNumbers, key, (i, k) -> {
//            try {
//                System.out.println(i / k);
//            }catch(ArithmeticException e){
//                System.out.println("An exception happened");
//            }
//        });

        process(someNumbers,key,wrapperLambada((v,k)->System.out.println(v/k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumbers) {
            biConsumer.accept(i, key);
        }

    }

    private static BiConsumer wrapperLambada(BiConsumer<Integer,Integer> biConsumer){
        return (v,k)->{
//            System.out.println("code from wrapper");
//since lambada can be encapsulate here then exception can write here
            try{
                biConsumer.accept((int)v,(int)k);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println("Exception in wrapper lambda");
            }

        };
//        return biConsumer;
    }
}
