package fileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a Number..!");

        int num = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num =Integer.parseInt(br.readLine());

            System.out.println("Entered number: " + num);
        }

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(in);
//
//        int num = 0;
//
//        try {
//            num = Integer.parseInt(br.readLine());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {                             //this finally can be used when there is no need to use the catch
//            System.out.println(num);            //this can also be used to close the files which are in use
//        }

    }
}
