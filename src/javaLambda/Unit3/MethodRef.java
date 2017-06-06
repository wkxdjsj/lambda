package javaLambda.Unit3;

/**
 * Created by xikaixiong on 6/6/17.
 */
public class MethodRef {
    public static void main(String[] args) {
        Thread t = new Thread(MethodRef::printMessage);
        //t and t2 just the same
        Thread t2 = new Thread(()->printMessage());
        t.start();
    }

    public static void printMessage() {
        System.out.println("static message");
    }
}
