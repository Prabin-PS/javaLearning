package exceptions;

public class Exceptions {

    public static void main(String[] Args) {

        int i = 1;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try {
            j = 12 / i;                         //Here if the value of i is 0 then it will cause the Arithmetic exception
            System.out.println(j);
            System.out.println(nums[1]);
            System.out.println(nums[4]);        // changing the index value to more than 4 will cause an array out of bound exception
            System.out.println(str.length());   // If null value is provided for the str then it will cause the exception

        }
        catch (ArithmeticException e) {

            System.out.println("Something Went Wrong" + " " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Something Went Wrong" + " " + e);
        }
        catch (Exception e){
            System.out.println("Something Went Wrong" + " " + e);
        }

        System.out.println("This is example for exceptions");

    }


}
