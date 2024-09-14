import java.util.Scanner;

class BatteryHealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // Battery health percentage
            int X = sc.nextInt();

            // Check if battery health is 80% or more
            if (X >= 80) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
