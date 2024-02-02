class Test {

    int A = 1;

    public void show() {
        System.out.println("in show");
    }

    class B {                           // If I mention as "static class B" then while creating object for this class
        //we dont have to specify object instead we can use as "Test.B b = new Test.B();
        public void functionb() {
            System.out.println("in function B");
        }
    }
}

public class InnerClass {

    public static void main(String[] Args) {

        Test test = new Test();
        Test.B b = test.new B();            //Since B belongs to test we are specifying while creating objects
        b.functionb();

    }
}
