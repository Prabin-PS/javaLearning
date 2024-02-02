class A1{
    public void test(){
        System.out.println("This is test");
    }
}

//class B1 extends A1{                            //If this class is created only one time then we can create while creating object
//    public void test1{
//        System.out.println("Printing test");
//    }
//}

public class AnonymousClass {

    public static void main(String [] Args){

        A1 a = new A1(){
            public void test() {                        // Now this class is called Anonymous class and can be used in Abstract class too
                System.out.println("Printing test");
            }
        };
        a.test();

    }
}
