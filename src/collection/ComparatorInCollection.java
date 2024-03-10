package collection;

import java.util.*;
import java.util.ArrayList;

public class ComparatorInCollection {

    public static void main(String[] Args) {

//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            public int compare(Integer a, Integer b) {
//                if(a%10>b%10)
//                    return 1;
//                else {
//                    return -1;
//                }
//            }
//        };                    Instead of this we are using the below one line

        Comparator<Integer> comparator = (Integer a, Integer b) -> {return (a % 10 > b % 10)?1:-1;};   //Code optimization

        List<Integer> nums = new ArrayList<>();
        nums.add(52);
        nums.add(43);
        nums.add(78);
        nums.add(97);

        Collections.sort(nums, comparator);    //Here Collections is a class which contains a sort() method which will sort the values-
        //in above the comparator is where we define the customized sorting using Comparator interface
        System.out.println(nums);

    }
}


//NOTES :

//Generally in collection
//Collection API - this mentions API/framework
//Collections -  This is a class
//Collection -  This refers to interface

//Comparator - It will help us to create a customized sorting option

//comparable - If you want to give the power to the class itself to compare itself or compare the objects with itself