import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the target score and the current score
            int X = sc.nextInt();
            int Y = sc.nextInt();

            // Calculate and print the number of additional runs needed
            int runsNeeded = X - Y;
            System.out.println(runsNeeded);
        }

        sc.close();
    }
}
