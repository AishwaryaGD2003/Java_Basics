import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the scores of the two attempts
            int X = sc.nextInt();
            int Y = sc.nextInt();

            // Determine the maximum score
            int finalScore = Math.max(X, Y);
            System.out.println(finalScore);
        }

        sc.close();
    }
}
