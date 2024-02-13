abstract class Car {
    public abstract void drive();           //declaring a method instead of defining

    public void playmusic() {
        System.out.println("Playing music..");
    }
}

abstract class Swift extends Car {

    public abstract void fly();

    public void drive() {                    //method overriding
        System.out.println("Driving");
    }
}

class AdvancedSwift extends Swift {
    public void fly() {                     //method overriding
        System.out.println("Flying car");

    }
}

public class Abstract {

    public static void main(String[] Args) {

        //We cannot create object for an abstract class

        Swift swift = new AdvancedSwift();       //here we are creating an object for swift using the type as Car
        swift.drive();
        swift.playmusic();
        swift.fly();

    }

}
