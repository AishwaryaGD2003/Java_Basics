import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int X = sc.nextInt();
            int N = sc.nextInt();
            
            // Each test case is worth X/10 points
            int pointsPerTestCase = X / 10;
            
            // Calculate the total score based on passed test cases
            int score = pointsPerTestCase * N;
            
            // Output the result
            System.out.println(score);
        }
        
        sc.close();
    }
}
