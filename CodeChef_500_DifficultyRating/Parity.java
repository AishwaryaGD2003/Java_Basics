import java.util.Scanner;

class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // Number of chocolates
            int N = sc.nextInt();

            // Check if N is even
            if (N % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
