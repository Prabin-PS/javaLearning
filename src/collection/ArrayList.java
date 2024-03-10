package collection;

import java.util.Collection;        //With Collection we can only add values and fetch
import java.util.List;              //instead of Collection we can use the List to do operations with a list of values

public class ArrayList {

    public static void main(String[] Args ){
        List<Integer> nums = new java.util.ArrayList<Integer>();  //We are mentioning data type here so that we can perform-
        nums.add(29);                                             //operations in the output if required and to avoid the run time error
        nums.add(11);
        nums.add(37);
        nums.add(32);

        System.out.println(nums.get(2));    // Using List we will be able to use the index concept
        System.out.println(nums.indexOf(32));

        for(Integer n : nums) {
            System.out.println(n);
        }
    }
}


//List supports repeated values