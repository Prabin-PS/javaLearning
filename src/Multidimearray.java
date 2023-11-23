public class Multidimearray {

    public static void main(String[] Args) {
        int nums[][] = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (int) (Math.random() * 100);     //Math.random is a default library function
                // in the above the Math function is of double value and hence we are type casting
                // it to int before multiplying with 100
                System.out.print((nums[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int n[] : nums) {  // here the variable n is an array which will take values from nums
            for (int m : n) {   // Similarly the int m is an variable which will take value from the array n
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
