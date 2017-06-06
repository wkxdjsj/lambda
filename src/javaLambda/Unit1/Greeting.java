package javaLambda.Unit1;

/**
 * Created by xikaixiong on 6/5/17.
 */
@FunctionalInterface
public interface Greeting {
    public void perform();
    //by using default keyword in interface method then the interface can implement a method body
    public default void performjava8(){
        System.out.println("why not");
    }
}
