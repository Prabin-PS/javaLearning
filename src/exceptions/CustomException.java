package exceptions;

import java.util.SortedMap;

class PrabinException extends Exception { //This is the class which we will create for the custom exception
    public PrabinException(String string) {
        super(string); //Since we are passing string type for the super we class we are defining it here

    }
}

public class CustomException {

    public static void main(String[] Args) {

        int i = 20;
        int j = 0;

        try {
            j = 12 / i;
            if (j == 0) {
                throw new PrabinException("This is the throw exception"); //This is the custom exception which will throws when j==0
            }

        } catch (PrabinException e) {
            j = 12 / 1;
            System.out.println("This is the default exception" + " " + e);
        }
//        catch (Exception e) {
//            System.out.println("This is the parent class exception" + " " + e);
//        }
        System.out.println(j);
    }
}
