class Human {
    private int age; //declaring as private since we are not going to use it outside its class (for better security)
    //in turn we will use methods to access the variables in a class
    private String name;

    public int getAge() {           //This is the getter method by which we get the values
        return age;
    }

    public void setAge(int a) {     //This is the setter method by which we set the values
        age = a;                        //we are using void since we are not returning anything
    }

    public String getName() {       //This is the getter method by which we get the values
        return name;
    }

    public void setName(String n) {      //This is the setter method by which we set the values
        name = n;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(28);         //This is where we set the value of age
        obj.setName("Nisha");   //This is where we set the value of name
        System.out.println(obj.getAge() + " is age of " + obj.getName());

    }
}
