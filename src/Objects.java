public class Objects {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;

        Multiply multiply = new Multiply();
        int result = multiply.cross(num1, num2);
        System.out.println(result);
    }
}

class Multiply {
    public int cross(int n1, int n2) {
        int m = n1 * n2;
        return m;
    }
}
