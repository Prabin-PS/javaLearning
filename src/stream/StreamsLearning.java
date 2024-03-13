package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsLearning {

    public static void main(String[] Args) {

        List<Integer> nums = Arrays.asList(3, 6, 8, 4, 2);

//      Stream<Integer> s1 = nums.stream();             //The stream value can be used only once
//      Stream<Integer> s2 = s1.filter(n->n%2==0);      //that is why we are creating another object s2 - this will create same set of values
//      Stream<Integer> s3 = s2.map(n->n*2);
//      int result = s3.reduce(0,(c,e)-> c+e);

        //optimized codes for the above
        int result = nums.stream()
                .filter(n -> n % 2 == 0)                //filter needs an object of type predicate which is a functional interface
                .map(n -> n * 2)                        //map belongs to a functional interface called Function
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

//        s1.forEach(n -> System.out.println(n));


    }

}


//NOTE : This is how the filter method evolved using lambda expression
//
//        Predicate<Integer> ₽ = new Predicate<Integer>() {
//              public boolean test (Integer n) {
//              if（r2==0）
//                   return true;
//               else
//                   return false;
//        ｝


//    This is how the map method evolved using lambda expression

//        Function<Integer, Integer> n = new Function<Integer, Integer>() {
//
//            public Integer apply(Integer n1) {
//                return n1 * 2;
//            }
//        }