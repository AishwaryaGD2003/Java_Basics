import java.util.Scanner;

class ChefOnDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // Amount Chef has and the bill amount
            int X = sc.nextInt();
            int Y = sc.nextInt();

            // Check if Chef has enough money
            if (X >= Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
