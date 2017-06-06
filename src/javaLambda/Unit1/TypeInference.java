package javaLambda.Unit1;

/**
 * Created by xikaixiong on 6/5/17.
 */
public class TypeInference {
    public static void main(String[] args) {
        StringLength stringLength = (String s) -> s.length();
        //as interface knows the parameter must be a String then you can infer it as a String
        StringLength stringLength2 = (s) -> s.length();
        //single parameter can also ignore the parenthesis
        StringLength stringLength3 = s -> s.length();

        int i = stringLength.getLength("xiong");
        System.out.println("the length of the string is "+i);
        printLambda(s->s.indexOf("i"));
    }

    public static void printLambda(StringLength stringLength){
        System.out.println(stringLength.getLength("xiongxikai"));
    }

    interface StringLength{
        int getLength(String s);
    }
}
