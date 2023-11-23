import java.sql.SQLOutput;

public class Students {

    public static void main(String[] Args) {

        Eleven e1 = new Eleven();
        e1.studentid = 1;
        e1.studentname = "Nami";
        e1.rollno = "123";

        Eleven e2 = new Eleven();
        e2.studentid = 1;
        e2.studentname = "Luffy";
        e2.rollno = "12345";

        Eleven e3 = new Eleven();
        e3.studentid = 1;
        e3.studentname = "Zorro";
        e3.rollno = "67890";

        Eleven eleven[] = new Eleven[3];
        eleven[0] = e1;
        eleven[1] = e2;
        eleven[2] = e3;

//      for (int i = 0; i < eleven.length; i++) { //This a normal forloop  flow
//
//            System.out.println(eleven[i].rollno+ " : " + eleven[i].studentname);
//        }
        for (Eleven eleven1 : eleven) {  //This is an enhanced for loop where we don't have to declare or increment

            System.out.println(eleven1.rollno + " : " + eleven1.studentname);
        }
    }
}

class Eleven {
    int studentid;
    String studentname;
    String rollno;
}