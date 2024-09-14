import java.util.Scanner;

class TomAndJerryChase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // Speed of Jerry and Tom
            int X = sc.nextInt();
            int Y = sc.nextInt();

            // Determine if Tom can catch Jerry
            if (Y > X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
