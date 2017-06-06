package javaLambda.Unit1;

/**
 * Created by xikaixiong on 6/5/17.
 * as runnable interface has only one method which just match the java lambda definition
 */
public class RunnableExampleUsingLambda {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable");
            }
        });

        myThread.run();


        Thread lambdaThread = new Thread(()-> System.out.println("lambda thread"));
        lambdaThread.run();
    }
}
