package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodInJava {

    public static void main(String[] Args) {

        List<Integer> nums = Arrays.asList(5, 8, 9, 3);

//        Consumer<Integer> con = new Consumer<Integer>() {        // Consumer is a functional interface
//            public void accept(Integer n) {                     //using anonymous class hence can be replaced with Lambda expression
//                System.out.println(n);
//            }
//        };

//        nums.forEach(con);

        //Below is the optimized foreach method for the above
        nums.forEach(n -> System.out.println(n));

//        for(int i=0;i<nums.size();i++ ){                      //Serves the same purpose of the above code. Just for reference
//            System.out.println(nums.get(i));
//        }


//        for(int n : nums){                                    //Serves the same purpose of the above code. Just for reference
//            System.out.println(n);
//        }
    }
}
