package collection;

import java.util.HashMap;
import java.util.Map;

public class MapInCollection {

    public static void main(String[] Args){

        Map<String, Integer> students = new HashMap<>();    //Instead of Hashmap we can also use Hashtable -
        students.put("Nisha", 40);                          //in case if multiple threads since its synchronised
        students.put("Prabin",98);
        students.put("Kavya", 60);
        students.put("Kanna", 80);
        students.put("Bibin", 70);
        students.put("Nisha", 90);  //In Map the Key will be unique and hence for Nisha the last updated value will be taken

//
//        System.out.println(students);
//        System.out.println(students.get("Nisha"));
//        System.out.println(students.keySet());        //This will give the keys alone

        for(String n : students.keySet()){
            System.out.println(n + " : " + students.get(n));
        }

    }
}
