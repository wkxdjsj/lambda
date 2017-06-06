package javaLambda.Unit2;

/**
 * Created by xikaixiong on 6/6/17.
 */
public class ClosureTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //doProcess doesn't define b in it's body but b value can be used as below which java runtime is keeping track
        // of the value of b. So b is final or effectively final
        // where does this b value from? it's from the the Closure(something in the scope)
        doProcess(a, (i) -> {
            System.out.println(i+b);
        });

    }


    public static void doProcess(int i, Process p) {
        p.process(i);
    }

    interface Process{
        void process(int i);
    }
}


