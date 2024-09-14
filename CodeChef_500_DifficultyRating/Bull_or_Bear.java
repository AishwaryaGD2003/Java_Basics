import java.util.Scanner;

public class BullOrBear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the bought and sold values
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            // Determine profit, loss, or neutral
            if (Y > X) {
                System.out.println("PROFIT");
            } else if (Y < X) {
                System.out.println("LOSS");
            } else {
                System.out.println("NEUTRAL");
            }
        }
        
        scanner.close();
    }
}
