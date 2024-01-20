import Inheritence.AdvCalc;
import Inheritence.Calc;

public class Main {
    public static void main(String[] args) {

        AdvCalc obj = new AdvCalc();

        int r1 = obj.add(1,2);
        int r2 = obj.sub(7,5);
        int r3 = obj.multiply(3, 5);
        int r4 = obj.div(10,2);

        System.out.println("The outputs are " + r1 + "," + r2 + "," + r3 + "," + r4 );
    }

}
