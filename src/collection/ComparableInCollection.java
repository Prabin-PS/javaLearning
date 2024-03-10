package collection;

import java.util.*;
import java.util.ArrayList;


class Students implements Comparable<Students>{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    public int compareTo(Students that) {
        return (this.age > that.age) ? 1 : -1;  //Since we are defining the method compareTo inside the class itself hence we can use this keyword
    }
}


public class ComparableInCollection {

    public static void main(String[] Args) {
//
//        Comparator<Students> comparator = new Comparator<Students>() {    //Instead of this we are using comparable
//            public int compare(Students a, Students b) {
//                return (a.age  > b.age)?1:-1;
//            }
//        };

        List<Students> studs = new ArrayList<>();
        studs.add(new Students(28, "Prabin"));
        studs.add(new Students(27, "Nisha"));
        studs.add(new Students(25, "Bibin"));
        studs.add(new Students(20, "Kavya"));


        Collections.sort(studs);    //Here Collections is a class which contains a sort() method which will sort the values-
        //in above the comparator is where we define the customized sorting using Comparator interface

        for (Students s : studs) {
            System.out.println(s);
        }


    }
}



