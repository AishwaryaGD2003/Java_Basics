import java.util.Scanner;

class CandyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // Number of candies
            int N = sc.nextInt();

            // Check if candies can be divided equally among three friends
            if (N % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
