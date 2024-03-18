package fileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        System.out.println("Enter a number, Prabin!");

        //For the getting the input we can simply use the scanner option - recently released
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        InputStreamReader in = new InputStreamReader(System.in);        //For the below we are creating an object here
        BufferedReader bf = new BufferedReader(in);                     // Buffered reader require a object to be passed inorder to read

        int num = 0;

        try {                                                           //  We are using try catch here to avoid the run time exception
            num = Integer.parseInt(bf.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(num);

//        bf.close();   At anytime if we open any files then we need to close the file as well that's why we use this
    }
}
