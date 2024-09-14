import java.util.Scanner;

class TotalPrizeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // Prize for top 10 rankers and prize for ranks 11 to 100
            int X = sc.nextInt();
            int Y = sc.nextInt();

            // Total prize money calculation
            int totalPrizeMoney = (10 * X) + (90 * Y);

            // Output the total prize money
            System.out.println(totalPrizeMoney);
        }

        sc.close();
    }
}
