package Interface;          //Interface is not a class

interface Computer {        //Instead of abstract classes we use interface at the design time itself
    //when an abstract class has only abstract methods then we can replace that with interface
    void code();            //by default every method in interface class is public & abstract
}                           //if variables are created in inside interface that will be final & static by default

class Laptop implements Computer {  //in implements you will only get the methods & not variables
    public void code() {       //If interface is implemented in a class then its mandatory to define all of its methods
        System.out.println("using laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("using desktop");
    }

}

class Developer {
    public void devapp(Computer desktop) { //in this method also we are passing the reference object with its type "Computer"
        desktop.code();
    }
}

public class Interface {

    public static void main(String[] args) {

        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer prabin = new Developer();
        prabin.devapp(desktop); //here we are passing the reference object (desktop) for the method devapp()

    }
}


//NOTES :

//one class can implement multiple interfaces and only condition is to define their methods inside
//class - class --> extends
//class - interface --> implements
//interface - interface --> extends