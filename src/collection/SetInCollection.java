package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetInCollection {
    public static void main(String[] Args){

        Set<Integer> nums = new TreeSet<>();    //Instead of Hashset if Treeset is used then
        nums.add(22);
        nums.add(46);
        nums.add(68);
        nums.add(31);


        Iterator<Integer> values = nums.iterator();  //We are using Iterator instead of for loop just to understand
        while(values.hasNext())
            System.out.println(values.next());


//        for(int n : nums){
//            System.out.println(n);   //The output wont be of input sequence and will be random
//        }

    }
}


//Set doesnt have index
//Treeset implements SET and SET extends collections so instead of SET we can use collections (which will work)