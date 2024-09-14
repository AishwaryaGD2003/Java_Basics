import java.util.Scanner;

public class ChairsRequirement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the number of students and the number of chairs available
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            // Calculate the number of extra chairs needed
            int extraChairs = Math.max(0, X - Y);
            
            // Output the result
            System.out.println(extraChairs);
        }
        
        // Close the scanner
        scanner.close();
    }
}
