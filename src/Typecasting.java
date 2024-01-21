
class A {
    public void showA() {
        System.out.println("in Show A");
    }
}
class B extends A {
    public void showB() {
        System.out.println("in Show B");
    }
}

public class Typecasting {

    public static void main(String[] Args) {

        A a = (A)new B(); // Reference of A and object of B
        //This is called upcasting or upper class casting
        a.showA();

       B b = (B) a; //// Reference of B and object of a
       //This is called down casting or lower class casting
       b.showB();
    }
}
