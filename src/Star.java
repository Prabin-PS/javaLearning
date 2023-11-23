public class Star {
    public static void main(String[] args) {
        int n = 5;
        char star[][] = new char[n][n * 2 - 1];

        for (int i = 0; i < n; i++) {   //for inserting the space for all the objects
            for (int j = 0; j < (n * 2 - 1); j++) {
                star[i][j] = ' ';
            }
        }
        for (int i = 0; i < n; i++) {   //for inserting stars in the required objects
            for (int j = (n - i - 1); j <= (n + i - 1); j++) {
                star[i][j] = '*';
            }
        }
        for (int i = 0; i < n; i++) {   //for printing the values
            for (int j = 0; j < (n * 2 - 1); j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

    }
}
