import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of triples
        int N = scanner.nextInt();
        
        // Process each triple
        for (int i = 0; i < N; i++) {
            // Read the three integers
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            // Find the second-maximum number
            int max1 = Math.max(a, Math.max(b, c));
            int min1 = Math.min(a, Math.min(b, c));
            int secondMax = a + b + c - max1 - min1;
            
            // Print the second-maximum number
            System.out.println(secondMax);
        }
        
        scanner.close();
    }
}
