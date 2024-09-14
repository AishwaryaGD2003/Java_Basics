import java.util.Scanner;

class RollerCoaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // Read the height of Chef's son and the minimum height required
            int X = sc.nextInt();
            int H = sc.nextInt();

            // Determine if Chef's son can go on the ride
            if (X >= H) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
