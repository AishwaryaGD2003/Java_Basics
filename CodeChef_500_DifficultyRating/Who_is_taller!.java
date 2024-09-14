import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read heights of Alice and Bob
            int X = sc.nextInt();
            int Y = sc.nextInt();

            // Determine who is taller and print the result
            if (X > Y) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }

        sc.close();
    }
}
