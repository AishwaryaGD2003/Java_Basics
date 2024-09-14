import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the number of people and the capacity of the party hall
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            
            // Check if the number of people is within the capacity
            if (N <= X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
