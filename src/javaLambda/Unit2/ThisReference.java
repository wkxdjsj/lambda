package javaLambda.Unit2;

/**
 * Created by xikaixiong on 6/6/17.
 */
public class ThisReference {
    public static void main(String[] args) {
        ThisReference thisReference = new ThisReference();
        System.out.println("reference itself: "+thisReference);
//        thisReference.doProcess(10, new Process() {
//            @Override
//            public void process(int i) {
//                System.out.println("i is "+i);
//                //this represents the anonymous class's or interface's object
//                System.out.println("reference inside " +this);
//            }
//
//            @Override
//            public String toString() {
//                return "String method inside of inner class";
//            }
//        });

        thisReference.doProcess(10,i->{
            System.out.println("value of i is "+i);
//            by design lambda this won't work as it's static
//            System.out.println(this);
        });


        System.out.println("=================");
        thisReference.doExecute();
    }

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void doExecute(){
        doProcess(20,i->{
            System.out.println(i);
            //this refer to the object outside of the its lambda expression
            System.out.println(this);
        });


    }

    interface Process{
        void process(int i);
    }


    @Override
    public String toString() {
        return "this object String method being changed";
    }
}
