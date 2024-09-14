import java.util.Scanner;

public class FourTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the cost of each ticket
            int X = scanner.nextInt();
            
            // Calculate the total cost for 4 tickets
            int totalCost = 4 * X;
            
            // Determine if they can afford the tickets
            if (totalCost <= 1000) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
