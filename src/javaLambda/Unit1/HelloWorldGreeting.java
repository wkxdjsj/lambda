package javaLambda.Unit1;

/**
 * Created by xikaixiong on 6/5/17.
 */
public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("from implement HelloWorldGreeting");
    }
}
