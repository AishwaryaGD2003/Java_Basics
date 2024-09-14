import java.util.Scanner;

class CountingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // Number of pages and number of words per page
            int N = sc.nextInt();
            int M = sc.nextInt();

            // Total number of words calculation
            int totalWords = N * M;

            // Output the total number of words
            System.out.println(totalWords);
        }

        sc.close();
    }
}
