package javaLambda.Unit1;

/**
 * Created by xikaixiong on 6/5/17.
 * use interface to catch the return value of lambda expression
 *  用interface 去接住lambda表达式的返回值
 */
public class Greeter {
//    first part
//    public void greet() {
//        System.out.println("greet: hello world");
//    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
//        first part
//        greeter.greet();

//        use lambda to replace below code
//        greeter.greet(new Greeting() {
//            @Override
//            public void perform() {
//                System.out.println("hello world");
//            }
//        });
        greeter.greet(() -> System.out.println("hello world"));

        greeter.greet(() -> System.out.println("what"));

        greeter.greet(new HelloWorldGreeting());

         mylambda lambdaGreet = (int i) -> System.out.println("what is the type of None args lambada expression");
         Greeting lambdaGreet2 = () -> System.out.println("what is the type of None args lambada expression");
         lambdaGreet.fool(5);
         lambdaGreet2.perform();

         addtion addFunction = (int a,int b) ->a+b;
        System.out.println(addFunction.add(5, 6));

//        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
//            if (b == 0) return 0;
//            return a / b;
//        };
//
//        int i = intBinaryOperator.applyAsInt(6, 5);
//        System.out.println(i);


        //difference between interface implementation and lambda expression
        //lambda is implementing a function not at a class (interface) level
        //naturally lambda realize the same functionality as anonymous class
        Greeting h1 = new HelloWorldGreeting();
        h1.performjava8();
        Greeting h2 = ()-> System.out.println("direct call ");
        h1.perform();
        h2.perform();
    }


interface mylambda{
    void fool(int i);
    }

interface addtion{
        int add(int a,int b);
    }
}
