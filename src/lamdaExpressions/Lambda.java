package lamdaExpressions;

@FunctionalInterface
interface FunctionInterface {
    int sum(int a, int b);
}

public class Lambda {

    public static void main(String[] Args) {

        FunctionInterface functionInterface = (a,b) -> a+b;
        int result = functionInterface.sum(5, 6);
        System.out.println("Result" + "=" + result);
    }
}


//public class Lambda {
//    public static void main(String[] Args) {
//          FunctionInterface functionInterface = new FunctionInterface() {
//          public int sum(int a, int b) {
//          return a+b;
//            }
//        };
//        int result = functionInterface.sum(5, 6);
//        System.out.println("Result" + "=" + result);
//    }
//}

//Instead of the above code we can replace it with the lambda expression which is replaced in the live code above
