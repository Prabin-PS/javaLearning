package fileHandling;

import java.io.*;

public class TxtFile {

    public static void main(String[] args) throws Exception {


        File f = new File("demo.txt");             //Here we are specifying a path name for file with object creation
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);           //write UTF belongs to class
        dos.writeUTF(" Prabin and Nisha lived forever <3 ");    //This is how the content are written in file

        //UTF is the format of the file

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}