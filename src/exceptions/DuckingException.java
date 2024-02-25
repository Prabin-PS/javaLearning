package exceptions;
class A{
    public void show(){
        try {
            Class.forName("exceptions.Demo");           //here the demo class is not available in this package hence we will get exception
        }
        catch (ClassNotFoundException e){
            System.out.println("testingEX" +" "+e);
        }
    }
}

public class DuckingException {
    public static void main(String [] Args) {                   //We dont use throws in main() since JVM will stop the execution which is not advisible
        System.out.println("Welcome to Ducking Exceptions");
        A obj = new A();        //We can remove the try Catch for the above class A and use here instead so that when show() is called it will run a catch
        obj.show();

    }
}
